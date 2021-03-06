import {Injectable} from "@angular/core";

import {Post} from "../models/Post";
import {Author} from "../models/Author";

@Injectable()
export class BlogDataService {
    public getTestPosts(): Post[] {
                return [testPost, testPost];
            }

    public getTestAuthor(): Author {
                return testAuthor;
            }
}

const testAuthor: Author = {
    name: "John Doe"
};

const testPost: Post = {
    title: "This is a test post",
    content: "Lorem ipsum dolor sit amet, consectetur " +
    "adipiscing elit, sed do eiusmod tempor incididunt ut labore et",
    author: testAuthor
};
