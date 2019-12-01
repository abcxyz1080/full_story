namespace java com.demo.truyenfull.lib

struct TComic {
  1: i64 idComic,
  2: string title,
  3: string description,
  4: string author,
  5: string thumbnail,
  6: string status,
  7: string link,
  8: string numberOfChapter,
  9: list<TCategory> categories,
  10: list<TChapter> chapters
}

struct TChapter {
  1: i64 idChapter,
  2: string title,
  3: string content,
  4: string link,
  5: TComic comic
}

struct TCategory {
  1: i64 idCategory,
  2: string name,
  3: string link,
  4: list<TComic> comics
}

service TCRUDComicService {
	string crawlerTruyenFull();
	list<TComic> getAllComic();
	TComic getComicById(1: i64 idComic);
	bool addComic(1: TComic comic);
	bool updateComic(1: TComic comic);
	bool deleteComic(1: i64 idComic);
}
