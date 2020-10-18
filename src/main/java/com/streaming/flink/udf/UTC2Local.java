package com.streaming.flink.udf;

import org.apache.flink.table.functions.ScalarFunction;

import java.sql.Timestamp;

/**
 * @author zhuhuipei
 * @Description:
 * @date 2020-08-21
 * @time 22:04
 */
public class UTC2Local extends ScalarFunction {

    public Timestamp eval(Timestamp s) {
        long timestamp = s.getTime() + 28800000;
        return new Timestamp(timestamp);
    }

}
