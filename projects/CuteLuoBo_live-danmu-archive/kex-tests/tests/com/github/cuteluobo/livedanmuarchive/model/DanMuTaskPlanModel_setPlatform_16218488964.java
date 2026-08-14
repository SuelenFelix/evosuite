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

public class DanMuTaskPlanModel_setPlatform_16218488964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6377;

    public DanMuTaskPlanModel_setPlatform_16218488964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6378 = new Integer(-75206835);
        Long term6416 = new Long(6315101499811179240L);
        Long term6418 = new Long(-3033337370154155851L);
        Integer term6420 = new Integer(-1618206977);
        Boolean term6422 = new Boolean(false);
        Boolean term6424 = new Boolean(false);
        Long term6426 = new Long(-3130003589475815807L);
        Long term6428 = new Long(-5344598381371854750L);
        Long term6430 = new Long(-3718250311794019732L);
        term6377 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6377, term6377.getClass(), "id", term6378);
        setField(term6377, term6377.getClass(), "platform", "hOncybyCAH");
        setField(term6377, term6377.getClass(), "videoCreatorUid", "QduALnDSVo");
        setField(term6377, term6377.getClass(), "videoId", "izPpKDErnQ");
        setField(term6377, term6377.getClass(), "videoCreatedTime", term6416);
        setField(term6377, term6377.getClass(), "slicedTime", term6418);
        setField(term6377, term6377.getClass(), "pageCurrent", term6420);
        setField(term6377, term6377.getClass(), "skip", term6422);
        setField(term6377, term6377.getClass(), "taskFail", term6424);
        setField(term6377, term6377.getClass(), "createTime", term6426);
        setField(term6377, term6377.getClass(), "updateTime", term6428);
        setField(term6377, term6377.getClass(), "finishTime", term6430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NnpwZBUTvx";
        callMethod(klass, "setPlatform", argTypes, term6377, args);
    }

};


