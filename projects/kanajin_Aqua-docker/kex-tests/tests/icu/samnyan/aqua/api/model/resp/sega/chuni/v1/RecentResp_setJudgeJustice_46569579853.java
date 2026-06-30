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

public class RecentResp_setJudgeJustice_46569579853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54167;
     Object term54219;

    public RecentResp_setJudgeJustice_46569579853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54167 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54183 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54169, term54169.getClass(), "year", 2022);
        setShortField(term54169, term54169.getClass(), "month", (short) 4);
        setShortField(term54169, term54169.getClass(), "day", (short) 26);
        setField(term54168, term54168.getClass(), "date", term54169);
        setByteField(term54173, term54173.getClass(), "hour", (byte) 4);
        setByteField(term54173, term54173.getClass(), "minute", (byte) 26);
        setByteField(term54173, term54173.getClass(), "second", (byte) 22);
        setIntField(term54173, term54173.getClass(), "nano", 390695663);
        setField(term54168, term54168.getClass(), "time", term54173);
        setField(term54167, term54167.getClass(), "playDate", term54168);
        setIntField(term54179, term54179.getClass(), "year", 2019);
        setShortField(term54179, term54179.getClass(), "month", (short) 10);
        setShortField(term54179, term54179.getClass(), "day", (short) 7);
        setField(term54178, term54178.getClass(), "date", term54179);
        setByteField(term54183, term54183.getClass(), "hour", (byte) 17);
        setByteField(term54183, term54183.getClass(), "minute", (byte) 16);
        setByteField(term54183, term54183.getClass(), "second", (byte) 55);
        setIntField(term54183, term54183.getClass(), "nano", 967207750);
        setField(term54178, term54178.getClass(), "time", term54183);
        setField(term54167, term54167.getClass(), "userPlayDate", term54178);
        setIntField(term54167, term54167.getClass(), "musicId", 265502816);
        setIntField(term54167, term54167.getClass(), "level", -1730476579);
        setIntField(term54167, term54167.getClass(), "customId", -1501333599);
        setIntField(term54167, term54167.getClass(), "playedCustom1", 1525193088);
        setIntField(term54167, term54167.getClass(), "playedCustom2", 1734906845);
        setIntField(term54167, term54167.getClass(), "playedCustom3", 678776902);
        setIntField(term54167, term54167.getClass(), "track", -1148076813);
        setIntField(term54167, term54167.getClass(), "score", 1450586432);
        setIntField(term54167, term54167.getClass(), "rank", 1726648633);
        setIntField(term54167, term54167.getClass(), "maxCombo", 859999867);
        setIntField(term54167, term54167.getClass(), "maxChain", 469845570);
        setIntField(term54167, term54167.getClass(), "rateTap", 1192737321);
        setIntField(term54167, term54167.getClass(), "rateHold", 827191651);
        setIntField(term54167, term54167.getClass(), "rateSlide", -432140549);
        setIntField(term54167, term54167.getClass(), "rateAir", -1134516117);
        setIntField(term54167, term54167.getClass(), "rateFlick", 1618532335);
        setIntField(term54167, term54167.getClass(), "judgeGuilty", 1620043047);
        setIntField(term54167, term54167.getClass(), "judgeAttack", -1329172198);
        setIntField(term54167, term54167.getClass(), "judgeJustice", -1036092775);
        setIntField(term54167, term54167.getClass(), "judgeCritical", 857844283);
        setIntField(term54167, term54167.getClass(), "playerRating", 559778075);
        setBooleanField(term54167, term54167.getClass(), "isNewRecord", false);
        setBooleanField(term54167, term54167.getClass(), "isFullCombo", true);
        setIntField(term54167, term54167.getClass(), "fullChainKind", 188273941);
        setBooleanField(term54167, term54167.getClass(), "isAllJustice", false);
        setIntField(term54167, term54167.getClass(), "characterId", 736020163);
        setIntField(term54167, term54167.getClass(), "skillId", 1233013986);
        setIntField(term54167, term54167.getClass(), "playKind", 342111166);
        setBooleanField(term54167, term54167.getClass(), "isClear", false);
        setIntField(term54167, term54167.getClass(), "skillLevel", -846825115);
        setIntField(term54167, term54167.getClass(), "skillEffect", -88572295);
        term54219 = new Integer(-1830705318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54219;
        callMethod(klass, "setJudgeJustice", argTypes, term54167, args);
    }

};


