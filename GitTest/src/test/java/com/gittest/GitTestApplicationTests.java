package com.gittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitTestApplicationTests {




    class Line{
        private int head[]=new int[128];
        private int head_point=0;
        private int tail[]=new int[128];
        private int tail_point=256;

        public int[] getHead() {
            return head;
        }

        public void setHead(int[] head) {
            this.head = head;
        }

        public int getHead_point() {
            return head_point;
        }

        public void setHead_point(int head_point) {
            this.head_point = head_point;
        }

        public int[] getTail() {
            return tail;
        }

        public void setTail(int[] tail) {
            this.tail = tail;
        }

        public int getTail_point() {
            return tail_point;
        }

        public void setTail_point(int tail_point) {
            this.tail_point = tail_point;
        }
    }


    @Test
    void contextLoads() {
        System.out.println("life is a fucking movie,人生如戏我，他跟我讲，屌你老母");
    }

}
