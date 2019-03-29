package main.webapp.main.java;

import com.zhangyingwei.cockroach.CockroachApplication;
import com.zhangyingwei.cockroach.annotation.EnableAutoConfiguration;
import com.zhangyingwei.cockroach.executer.task.Task;
import com.zhangyingwei.cockroach.queue.TaskQueue;

/**
 * Created by xgzhang on 2019/1/25.
 */
@EnableAutoConfiguration
public class CockroachApplicationTest {
    public static void main(String[] args) throws Exception {
        TaskQueue queue = TaskQueue.of();
        queue.push(new Task("https://www.jisilu.cn/data/cbnew/cb_list/?___jsl=LST___t=1553825909381"));
        CockroachApplication.run(CockroachApplicationTest.class,queue);
    }
}
