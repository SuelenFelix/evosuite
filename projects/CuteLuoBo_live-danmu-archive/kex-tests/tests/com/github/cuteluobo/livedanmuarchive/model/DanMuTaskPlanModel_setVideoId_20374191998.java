package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanMuTaskPlanModel_setVideoId_20374191998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6761;

    public DanMuTaskPlanModel_setVideoId_20374191998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6762 = new Integer(-860131894);
        Long term6800 = new Long(468487103823886117L);
        Long term6802 = new Long(4139034517298316285L);
        Integer term6804 = new Integer(-1022990421);
        Boolean term6806 = new Boolean(false);
        Boolean term6808 = new Boolean(false);
        Long term6810 = new Long(5797412846146719084L);
        Long term6812 = new Long(5319740127125920367L);
        Long term6814 = new Long(6465987664600701876L);
        term6761 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6761, term6761.getClass(), "id", term6762);
        setField(term6761, term6761.getClass(), "platform", "NzBMMhkhpT");
        setField(term6761, term6761.getClass(), "videoCreatorUid", "qCpEbQDHdF");
        setField(term6761, term6761.getClass(), "videoId", "AHbZyFOmlo");
        setField(term6761, term6761.getClass(), "videoCreatedTime", term6800);
        setField(term6761, term6761.getClass(), "slicedTime", term6802);
        setField(term6761, term6761.getClass(), "pageCurrent", term6804);
        setField(term6761, term6761.getClass(), "skip", term6806);
        setField(term6761, term6761.getClass(), "taskFail", term6808);
        setField(term6761, term6761.getClass(), "createTime", term6810);
        setField(term6761, term6761.getClass(), "updateTime", term6812);
        setField(term6761, term6761.getClass(), "finishTime", term6814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TwfWVQGiIj";
        callMethod(klass, "setVideoId", argTypes, term6761, args);
    }

};


