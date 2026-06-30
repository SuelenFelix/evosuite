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
import java.lang.Object;
import java.lang.Integer;

public class RecentResp_setMaxCombo_115770944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48511;
     Object term48563;

    public RecentResp_setMaxCombo_115770944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48511 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48527 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48513, term48513.getClass(), "year", 2010);
        setShortField(term48513, term48513.getClass(), "month", (short) 1);
        setShortField(term48513, term48513.getClass(), "day", (short) 25);
        setField(term48512, term48512.getClass(), "date", term48513);
        setByteField(term48517, term48517.getClass(), "hour", (byte) 2);
        setByteField(term48517, term48517.getClass(), "minute", (byte) 58);
        setByteField(term48517, term48517.getClass(), "second", (byte) 38);
        setIntField(term48517, term48517.getClass(), "nano", 91985442);
        setField(term48512, term48512.getClass(), "time", term48517);
        setField(term48511, term48511.getClass(), "playDate", term48512);
        setIntField(term48523, term48523.getClass(), "year", 2016);
        setShortField(term48523, term48523.getClass(), "month", (short) 8);
        setShortField(term48523, term48523.getClass(), "day", (short) 5);
        setField(term48522, term48522.getClass(), "date", term48523);
        setByteField(term48527, term48527.getClass(), "hour", (byte) 0);
        setByteField(term48527, term48527.getClass(), "minute", (byte) 44);
        setByteField(term48527, term48527.getClass(), "second", (byte) 0);
        setIntField(term48527, term48527.getClass(), "nano", 108509);
        setField(term48522, term48522.getClass(), "time", term48527);
        setField(term48511, term48511.getClass(), "userPlayDate", term48522);
        setIntField(term48511, term48511.getClass(), "musicId", 804113142);
        setIntField(term48511, term48511.getClass(), "level", 1426555916);
        setIntField(term48511, term48511.getClass(), "customId", 96582503);
        setIntField(term48511, term48511.getClass(), "playedCustom1", -2078044123);
        setIntField(term48511, term48511.getClass(), "playedCustom2", -888123997);
        setIntField(term48511, term48511.getClass(), "playedCustom3", 1348905505);
        setIntField(term48511, term48511.getClass(), "track", 670473947);
        setIntField(term48511, term48511.getClass(), "score", 24416797);
        setIntField(term48511, term48511.getClass(), "rank", 1333624993);
        setIntField(term48511, term48511.getClass(), "maxCombo", -1351263253);
        setIntField(term48511, term48511.getClass(), "maxChain", -2032135607);
        setIntField(term48511, term48511.getClass(), "rateTap", -1160239470);
        setIntField(term48511, term48511.getClass(), "rateHold", 601515362);
        setIntField(term48511, term48511.getClass(), "rateSlide", 361169760);
        setIntField(term48511, term48511.getClass(), "rateAir", 1796450668);
        setIntField(term48511, term48511.getClass(), "rateFlick", -1052517959);
        setIntField(term48511, term48511.getClass(), "judgeGuilty", -646227135);
        setIntField(term48511, term48511.getClass(), "judgeAttack", 445886422);
        setIntField(term48511, term48511.getClass(), "judgeJustice", -52982078);
        setIntField(term48511, term48511.getClass(), "judgeCritical", -1176310275);
        setIntField(term48511, term48511.getClass(), "playerRating", -992072250);
        setBooleanField(term48511, term48511.getClass(), "isNewRecord", false);
        setBooleanField(term48511, term48511.getClass(), "isFullCombo", true);
        setIntField(term48511, term48511.getClass(), "fullChainKind", -21937920);
        setBooleanField(term48511, term48511.getClass(), "isAllJustice", false);
        setIntField(term48511, term48511.getClass(), "characterId", -1136589460);
        setIntField(term48511, term48511.getClass(), "skillId", -503938545);
        setIntField(term48511, term48511.getClass(), "playKind", 2025866025);
        setBooleanField(term48511, term48511.getClass(), "isClear", false);
        setIntField(term48511, term48511.getClass(), "skillLevel", 1509936407);
        setIntField(term48511, term48511.getClass(), "skillEffect", 480159064);
        term48563 = new Integer(1447658561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48563;
        callMethod(klass, "setMaxCombo", argTypes, term48511, args);
    }

};


