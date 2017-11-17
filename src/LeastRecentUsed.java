class Page {
	int accessCount = 0;
	String pageName;
	
	public void setAccessCount(int accessCount) {
		this.accessCount = accessCount;
	}
	
	public int getAccessCount() {
		return accessCount;
	}
	
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
	public String getPageName() {
		return pageName;
	}
	
	@Override
	public String toString() {
		return "PageName:"+pageName + ",  accessCount:"+accessCount;
	}
}


public class LeastRecentUsed {
	private int SIZE = 5;
	Page pages[] = new Page[SIZE];
	int counter = 0;
	
	public void addPage(Page page) {
		int i = 0;
		if (counter < SIZE) {
			i = counter;
		} else {
			i = identifyLeastUsed();
			counter --;
		}
		pages[i] = page;
		counter++;
	}
	
	private int identifyLeastUsed() {
		int smallestIndex = 0;
		
		for (int i = 0; i < pages.length; i++) {
			if (pages[smallestIndex].getAccessCount() > pages[i].getAccessCount()) {
				smallestIndex = i;
			}
		}
	
		return smallestIndex;
	}
	
	private Page getPage(String pageName) throws PageNotFoundException {
		Page page = null;
		for (int i = 0; i < pages.length; i++) {
			if (pages[i]==null || pages[i].getPageName() == null) {
				break;
			}
			if (pages[i].getPageName().equals(pageName)) {
				pages[i].setAccessCount(pages[i].getAccessCount() + 1);
				page = pages[i];
				break;
			}
		}
		
		if(page == null) {
			throw new PageNotFoundException();
		}
	
		return page;
	}

	public static void main(String[] args) throws PageNotFoundException {
		 Page page1 = new Page();
		 page1.setPageName("Page1");
		 
		 Page page2 = new Page();
		 page2.setPageName("Page2");
		 
		 Page page3 = new Page();
		 page3.setPageName("Page3");
		 
		 Page page4 = new Page();
		 page4.setPageName("Page4");
		 
		 Page page5 = new Page();
		 page5.setPageName("Page5");
		 
		 LeastRecentUsed leastRecentUsed = new LeastRecentUsed();
		 
		 leastRecentUsed.addPage(page1);
		 leastRecentUsed.addPage(page2);
		 leastRecentUsed.addPage(page3);
		 leastRecentUsed.addPage(page4);
		 leastRecentUsed.addPage(page5);
		 
		 
		 System.out.println(leastRecentUsed.getPage("Page4"));
		 System.out.println(leastRecentUsed.getPage("Page2"));
		 System.out.println(leastRecentUsed.getPage("Page4"));
		 System.out.println(leastRecentUsed.getPage("Page3"));
		 System.out.println(leastRecentUsed.getPage("Page4"));
		 System.out.println(leastRecentUsed.getPage("Page1"));
		 System.out.println(leastRecentUsed.getPage("Page2"));
		 System.out.println(leastRecentUsed.getPage("Page4"));
		 System.out.println(leastRecentUsed.getPage("Page5"));
		 
		 
		 Page page6 = new Page();
		 page6.setPageName("Page6");
		 
		 leastRecentUsed.addPage(page6);
		 System.out.println(leastRecentUsed.getPage("Page6"));
		 
		 System.out.println(leastRecentUsed.getPage("Page1"));
		 
	}
}