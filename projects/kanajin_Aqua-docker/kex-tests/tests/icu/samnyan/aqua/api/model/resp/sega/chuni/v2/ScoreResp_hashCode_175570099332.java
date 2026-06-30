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

public class ScoreResp_hashCode_175570099332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52899;

    public ScoreResp_hashCode_175570099332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52899 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52899, term52899.getClass(), "musicId", 1000587160);
        setIntField(term52899, term52899.getClass(), "level", 1691425223);
        setIntField(term52899, term52899.getClass(), "playCount", 2086385537);
        setIntField(term52899, term52899.getClass(), "scoreMax", -898458301);
        setIntField(term52899, term52899.getClass(), "resRequestCount", -1752896);
        setIntField(term52899, term52899.getClass(), "resAcceptCount", -1202458563);
        setIntField(term52899, term52899.getClass(), "resSuccessCount", -974221589);
        setIntField(term52899, term52899.getClass(), "missCount", -167704667);
        setIntField(term52899, term52899.getClass(), "maxComboCount", -820617926);
        setBooleanField(term52899, term52899.getClass(), "isFullCombo", false);
        setBooleanField(term52899, term52899.getClass(), "isAllJustice", true);
        setBooleanField(term52899, term52899.getClass(), "isSuccess", false);
        setIntField(term52899, term52899.getClass(), "fullChain", -1871142929);
        setIntField(term52899, term52899.getClass(), "maxChain", -1594964553);
        setIntField(term52899, term52899.getClass(), "scoreRank", -1839071263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term52899, args);
    }

};


