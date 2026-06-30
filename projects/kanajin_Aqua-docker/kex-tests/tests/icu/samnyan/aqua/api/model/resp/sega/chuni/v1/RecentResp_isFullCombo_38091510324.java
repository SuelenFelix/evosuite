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

public class RecentResp_isFullCombo_38091510324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52603;

    public RecentResp_isFullCombo_38091510324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52603 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52609 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52619 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52605, term52605.getClass(), "year", 2014);
        setShortField(term52605, term52605.getClass(), "month", (short) 3);
        setShortField(term52605, term52605.getClass(), "day", (short) 25);
        setField(term52604, term52604.getClass(), "date", term52605);
        setByteField(term52609, term52609.getClass(), "hour", (byte) 21);
        setByteField(term52609, term52609.getClass(), "minute", (byte) 11);
        setByteField(term52609, term52609.getClass(), "second", (byte) 20);
        setIntField(term52609, term52609.getClass(), "nano", 320642457);
        setField(term52604, term52604.getClass(), "time", term52609);
        setField(term52603, term52603.getClass(), "playDate", term52604);
        setIntField(term52615, term52615.getClass(), "year", 2020);
        setShortField(term52615, term52615.getClass(), "month", (short) 4);
        setShortField(term52615, term52615.getClass(), "day", (short) 20);
        setField(term52614, term52614.getClass(), "date", term52615);
        setByteField(term52619, term52619.getClass(), "hour", (byte) 15);
        setByteField(term52619, term52619.getClass(), "minute", (byte) 24);
        setByteField(term52619, term52619.getClass(), "second", (byte) 35);
        setIntField(term52619, term52619.getClass(), "nano", 679127969);
        setField(term52614, term52614.getClass(), "time", term52619);
        setField(term52603, term52603.getClass(), "userPlayDate", term52614);
        setIntField(term52603, term52603.getClass(), "musicId", 1426555916);
        setIntField(term52603, term52603.getClass(), "level", 96582503);
        setIntField(term52603, term52603.getClass(), "customId", -2078044123);
        setIntField(term52603, term52603.getClass(), "playedCustom1", -888123997);
        setIntField(term52603, term52603.getClass(), "playedCustom2", 1348905505);
        setIntField(term52603, term52603.getClass(), "playedCustom3", 670473947);
        setIntField(term52603, term52603.getClass(), "track", 24416797);
        setIntField(term52603, term52603.getClass(), "score", 1333624993);
        setIntField(term52603, term52603.getClass(), "rank", -1351263253);
        setIntField(term52603, term52603.getClass(), "maxCombo", -2032135607);
        setIntField(term52603, term52603.getClass(), "maxChain", -1160239470);
        setIntField(term52603, term52603.getClass(), "rateTap", 601515362);
        setIntField(term52603, term52603.getClass(), "rateHold", 361169760);
        setIntField(term52603, term52603.getClass(), "rateSlide", 1796450668);
        setIntField(term52603, term52603.getClass(), "rateAir", -1052517959);
        setIntField(term52603, term52603.getClass(), "rateFlick", -646227135);
        setIntField(term52603, term52603.getClass(), "judgeGuilty", 445886422);
        setIntField(term52603, term52603.getClass(), "judgeAttack", -52982078);
        setIntField(term52603, term52603.getClass(), "judgeJustice", -1176310275);
        setIntField(term52603, term52603.getClass(), "judgeCritical", -992072250);
        setIntField(term52603, term52603.getClass(), "playerRating", -21937920);
        setBooleanField(term52603, term52603.getClass(), "isNewRecord", false);
        setBooleanField(term52603, term52603.getClass(), "isFullCombo", true);
        setIntField(term52603, term52603.getClass(), "fullChainKind", -1136589460);
        setBooleanField(term52603, term52603.getClass(), "isAllJustice", false);
        setIntField(term52603, term52603.getClass(), "characterId", -503938545);
        setIntField(term52603, term52603.getClass(), "skillId", 2025866025);
        setIntField(term52603, term52603.getClass(), "playKind", 1509936407);
        setBooleanField(term52603, term52603.getClass(), "isClear", false);
        setIntField(term52603, term52603.getClass(), "skillLevel", 480159064);
        setIntField(term52603, term52603.getClass(), "skillEffect", 1447658561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term52603, args);
    }

};


