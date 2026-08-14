package com.github.cuteluobo.livedanmuarchive.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuSenderTaskSelector_setEndFinishTime_38662776912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144;
     Object term1217;

    public DanMuSenderTaskSelector_setEndFinishTime_38662776912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1145 = new Long(7495904023107549024L);
        Long term1147 = new Long(8802866251294305945L);
        Long term1149 = new Long(4513004407927379358L);
        Long term1151 = new Long(-7115418542247301000L);
        Long term1153 = new Long(8034714140377562739L);
        Long term1155 = new Long(-2924531382671518368L);
        Long term1157 = new Long(-3948863953565024517L);
        Long term1159 = new Long(-6587807377747738663L);
        Integer term1161 = new Integer(-522618178);
        Long term1199 = new Long(-6301101997917060727L);
        Long term1201 = new Long(0L);
        Long term1203 = new Long(0L);
        Integer term1205 = new Integer(0);
        Boolean term1207 = new Boolean(false);
        Boolean term1209 = new Boolean(false);
        Long term1211 = new Long(8166095254618543564L);
        Long term1213 = new Long(-4598158870068953328L);
        Long term1215 = new Long(138235087558060686L);
        term1144 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1144, term1144.getClass(), "startCreateTime", term1145);
        setField(term1144, term1144.getClass(), "endCreateTime", term1147);
        setField(term1144, term1144.getClass(), "startUpdateTime", term1149);
        setField(term1144, term1144.getClass(), "endUpdateTime", term1151);
        setField(term1144, term1144.getClass(), "startFinishTime", term1153);
        setField(term1144, term1144.getClass(), "endFinishTime", term1155);
        setField(term1144, term1144.getClass(), "startVideoCreatedTime", term1157);
        setField(term1144, term1144.getClass(), "endVideoCreatedTime", term1159);
        setField(term1144, term1144.getClass(), "id", term1161);
        setField(term1144, term1144.getClass(), "platform", "SbAoxhfrkn");
        setField(term1144, term1144.getClass(), "videoCreatorUid", "kuTXqwMtDB");
        setField(term1144, term1144.getClass(), "videoId", "Ghbwtircqb");
        setField(term1144, term1144.getClass(), "videoCreatedTime", term1199);
        setField(term1144, term1144.getClass(), "danmuTotalNum", term1201);
        setField(term1144, term1144.getClass(), "danmuSentNum", term1203);
        setField(term1144, term1144.getClass(), "pageSize", term1205);
        setField(term1144, term1144.getClass(), "skip", term1207);
        setField(term1144, term1144.getClass(), "taskFail", term1209);
        setField(term1144, term1144.getClass(), "createTime", term1211);
        setField(term1144, term1144.getClass(), "updateTime", term1213);
        setField(term1144, term1144.getClass(), "finishTime", term1215);
        term1217 = new Long(5381386339318883012L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1217;
        callMethod(klass, "setEndFinishTime", argTypes, term1144, args);
    }

};


