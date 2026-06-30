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
import java.lang.Integer;

public class RecentResp_setMusicId_37664112235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53195;
     Object term53247;

    public RecentResp_setMusicId_37664112235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53195 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53211 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53197, term53197.getClass(), "year", 2020);
        setShortField(term53197, term53197.getClass(), "month", (short) 9);
        setShortField(term53197, term53197.getClass(), "day", (short) 29);
        setField(term53196, term53196.getClass(), "date", term53197);
        setByteField(term53201, term53201.getClass(), "hour", (byte) 4);
        setByteField(term53201, term53201.getClass(), "minute", (byte) 6);
        setByteField(term53201, term53201.getClass(), "second", (byte) 57);
        setIntField(term53201, term53201.getClass(), "nano", 936141628);
        setField(term53196, term53196.getClass(), "time", term53201);
        setField(term53195, term53195.getClass(), "playDate", term53196);
        setIntField(term53207, term53207.getClass(), "year", 2027);
        setShortField(term53207, term53207.getClass(), "month", (short) 7);
        setShortField(term53207, term53207.getClass(), "day", (short) 24);
        setField(term53206, term53206.getClass(), "date", term53207);
        setByteField(term53211, term53211.getClass(), "hour", (byte) 10);
        setByteField(term53211, term53211.getClass(), "minute", (byte) 31);
        setByteField(term53211, term53211.getClass(), "second", (byte) 33);
        setIntField(term53211, term53211.getClass(), "nano", 451257890);
        setField(term53206, term53206.getClass(), "time", term53211);
        setField(term53195, term53195.getClass(), "userPlayDate", term53206);
        setIntField(term53195, term53195.getClass(), "musicId", 1433214025);
        setIntField(term53195, term53195.getClass(), "level", 1424797105);
        setIntField(term53195, term53195.getClass(), "customId", 386281072);
        setIntField(term53195, term53195.getClass(), "playedCustom1", -782180775);
        setIntField(term53195, term53195.getClass(), "playedCustom2", -1971308334);
        setIntField(term53195, term53195.getClass(), "playedCustom3", -2070149565);
        setIntField(term53195, term53195.getClass(), "track", 1682543276);
        setIntField(term53195, term53195.getClass(), "score", 156914536);
        setIntField(term53195, term53195.getClass(), "rank", -1745894636);
        setIntField(term53195, term53195.getClass(), "maxCombo", 571282234);
        setIntField(term53195, term53195.getClass(), "maxChain", 1131350330);
        setIntField(term53195, term53195.getClass(), "rateTap", -1463702476);
        setIntField(term53195, term53195.getClass(), "rateHold", 90151812);
        setIntField(term53195, term53195.getClass(), "rateSlide", -416703693);
        setIntField(term53195, term53195.getClass(), "rateAir", -1718111500);
        setIntField(term53195, term53195.getClass(), "rateFlick", 2134049264);
        setIntField(term53195, term53195.getClass(), "judgeGuilty", -619693439);
        setIntField(term53195, term53195.getClass(), "judgeAttack", 1886882056);
        setIntField(term53195, term53195.getClass(), "judgeJustice", -689559993);
        setIntField(term53195, term53195.getClass(), "judgeCritical", 263696243);
        setIntField(term53195, term53195.getClass(), "playerRating", -2012537672);
        setBooleanField(term53195, term53195.getClass(), "isNewRecord", true);
        setBooleanField(term53195, term53195.getClass(), "isFullCombo", false);
        setIntField(term53195, term53195.getClass(), "fullChainKind", -879433115);
        setBooleanField(term53195, term53195.getClass(), "isAllJustice", true);
        setIntField(term53195, term53195.getClass(), "characterId", 275958841);
        setIntField(term53195, term53195.getClass(), "skillId", 1628668899);
        setIntField(term53195, term53195.getClass(), "playKind", -998305335);
        setBooleanField(term53195, term53195.getClass(), "isClear", false);
        setIntField(term53195, term53195.getClass(), "skillLevel", 2120008602);
        setIntField(term53195, term53195.getClass(), "skillEffect", 1085966764);
        term53247 = new Integer(-609882960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53247;
        callMethod(klass, "setMusicId", argTypes, term53195, args);
    }

};


