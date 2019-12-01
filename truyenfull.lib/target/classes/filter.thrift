namespace java com.demo.truyenfull.lib

service TFilterService {
	
	string getAllCategory();
	string getAllComic();
	
	string findComicByName(1: string name);
	string findComicByCategory(1: string category);
	string findComicByAuthor(1: string author);
	
	string findComicLastUpdate();
	string findComicLastCreate();
	string findComicIsFull();
	string findComicIsRelease();
	string findComicMostRate();
	string findComicMostView();
	
	string getComicChapters(1: string linkComic); 
}
