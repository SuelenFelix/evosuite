package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_hashCode_150110884346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3921;

    public ProfileResp_hashCode_150110884346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3921 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3978 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3921, term3921.getClass(), "userName", "jiKYgYHqIS");
        setIntField(term3921, term3921.getClass(), "level", 330043745);
        setField(term3921, term3921.getClass(), "exp", "DfISiziTgG");
        setLongField(term3921, term3921.getClass(), "point", -7632759764262745126L);
        setLongField(term3921, term3921.getClass(), "totalPoint", 3746481521207337771L);
        setIntField(term3921, term3921.getClass(), "playCount", -509349195);
        setIntField(term3921, term3921.getClass(), "playerRating", -1639041228);
        setIntField(term3921, term3921.getClass(), "highestRating", 2027686272);
        setIntField(term3921, term3921.getClass(), "nameplateId", -1494356104);
        setIntField(term3921, term3921.getClass(), "frameId", -695279311);
        setIntField(term3921, term3921.getClass(), "characterId", 114279242);
        setIntField(term3921, term3921.getClass(), "trophyId", 990883365);
        setIntField(term3921, term3921.getClass(), "totalMapNum", 633598642);
        setLongField(term3921, term3921.getClass(), "totalHiScore", 4341016500855678917L);
        setLongField(term3921, term3921.getClass(), "totalBasicHighScore", -5871746020807491998L);
        setLongField(term3921, term3921.getClass(), "totalAdvancedHighScore", 4742108233936970770L);
        setLongField(term3921, term3921.getClass(), "totalExpertHighScore", 2722004046017350471L);
        setLongField(term3921, term3921.getClass(), "totalMasterHighScore", 6636235983121346803L);
        setIntField(term3921, term3921.getClass(), "friendCount", 1862841859);
        setIntField(term3964, term3964.getClass(), "year", 2020);
        setShortField(term3964, term3964.getClass(), "month", (short) 12);
        setShortField(term3964, term3964.getClass(), "day", (short) 21);
        setField(term3963, term3963.getClass(), "date", term3964);
        setByteField(term3968, term3968.getClass(), "hour", (byte) 20);
        setByteField(term3968, term3968.getClass(), "minute", (byte) 16);
        setByteField(term3968, term3968.getClass(), "second", (byte) 59);
        setIntField(term3968, term3968.getClass(), "nano", 976524801);
        setField(term3963, term3963.getClass(), "time", term3968);
        setField(term3921, term3921.getClass(), "firstPlayDate", term3963);
        setIntField(term3974, term3974.getClass(), "year", 2028);
        setShortField(term3974, term3974.getClass(), "month", (short) 5);
        setShortField(term3974, term3974.getClass(), "day", (short) 15);
        setField(term3973, term3973.getClass(), "date", term3974);
        setByteField(term3978, term3978.getClass(), "hour", (byte) 20);
        setByteField(term3978, term3978.getClass(), "minute", (byte) 31);
        setByteField(term3978, term3978.getClass(), "second", (byte) 49);
        setIntField(term3978, term3978.getClass(), "nano", 945744862);
        setField(term3973, term3973.getClass(), "time", term3978);
        setField(term3921, term3921.getClass(), "lastPlayDate", term3973);
        setIntField(term3921, term3921.getClass(), "courseClass", -1114668574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3921, args);
    }

};


