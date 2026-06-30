package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScoreResp_getLevel_16352000121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52371;

    public ScoreResp_getLevel_16352000121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52371 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52371, term52371.getClass(), "musicId", -870011438);
        setIntField(term52371, term52371.getClass(), "level", -1767217325);
        setIntField(term52371, term52371.getClass(), "playCount", -170630873);
        setIntField(term52371, term52371.getClass(), "scoreMax", -1246900588);
        setIntField(term52371, term52371.getClass(), "resRequestCount", 548633933);
        setIntField(term52371, term52371.getClass(), "resAcceptCount", -1532179986);
        setIntField(term52371, term52371.getClass(), "resSuccessCount", 1644599689);
        setIntField(term52371, term52371.getClass(), "missCount", 1665477880);
        setIntField(term52371, term52371.getClass(), "maxComboCount", 2044728583);
        setBooleanField(term52371, term52371.getClass(), "isFullCombo", false);
        setBooleanField(term52371, term52371.getClass(), "isAllJustice", true);
        setBooleanField(term52371, term52371.getClass(), "isSuccess", false);
        setIntField(term52371, term52371.getClass(), "fullChain", 64790905);
        setIntField(term52371, term52371.getClass(), "maxChain", -1199056049);
        setIntField(term52371, term52371.getClass(), "scoreRank", -1074336148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term52371, args);
    }

};


