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

public class RecentResp_setCharacterId_125118365160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49375;
     Object term49427;

    public RecentResp_setCharacterId_125118365160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49375 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49381 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49391 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49377, term49377.getClass(), "year", 2010);
        setShortField(term49377, term49377.getClass(), "month", (short) 8);
        setShortField(term49377, term49377.getClass(), "day", (short) 29);
        setField(term49376, term49376.getClass(), "date", term49377);
        setByteField(term49381, term49381.getClass(), "hour", (byte) 14);
        setByteField(term49381, term49381.getClass(), "minute", (byte) 6);
        setByteField(term49381, term49381.getClass(), "second", (byte) 52);
        setIntField(term49381, term49381.getClass(), "nano", 882272618);
        setField(term49376, term49376.getClass(), "time", term49381);
        setField(term49375, term49375.getClass(), "playDate", term49376);
        setIntField(term49387, term49387.getClass(), "year", 2011);
        setShortField(term49387, term49387.getClass(), "month", (short) 3);
        setShortField(term49387, term49387.getClass(), "day", (short) 21);
        setField(term49386, term49386.getClass(), "date", term49387);
        setByteField(term49391, term49391.getClass(), "hour", (byte) 10);
        setByteField(term49391, term49391.getClass(), "minute", (byte) 56);
        setByteField(term49391, term49391.getClass(), "second", (byte) 39);
        setIntField(term49391, term49391.getClass(), "nano", 54553750);
        setField(term49386, term49386.getClass(), "time", term49391);
        setField(term49375, term49375.getClass(), "userPlayDate", term49386);
        setIntField(term49375, term49375.getClass(), "musicId", 710841913);
        setIntField(term49375, term49375.getClass(), "level", 293875732);
        setIntField(term49375, term49375.getClass(), "customId", -375636222);
        setIntField(term49375, term49375.getClass(), "playedCustom1", 2019131833);
        setIntField(term49375, term49375.getClass(), "playedCustom2", -2057057319);
        setIntField(term49375, term49375.getClass(), "playedCustom3", -872007840);
        setIntField(term49375, term49375.getClass(), "track", 614977875);
        setIntField(term49375, term49375.getClass(), "score", -424672642);
        setIntField(term49375, term49375.getClass(), "rank", -1836107736);
        setIntField(term49375, term49375.getClass(), "maxCombo", 1774306588);
        setIntField(term49375, term49375.getClass(), "maxChain", 897867869);
        setIntField(term49375, term49375.getClass(), "rateTap", -1058380964);
        setIntField(term49375, term49375.getClass(), "rateHold", 1144389305);
        setIntField(term49375, term49375.getClass(), "rateSlide", 785140032);
        setIntField(term49375, term49375.getClass(), "rateAir", 2011478303);
        setIntField(term49375, term49375.getClass(), "rateFlick", -1064254847);
        setIntField(term49375, term49375.getClass(), "judgeGuilty", 427797900);
        setIntField(term49375, term49375.getClass(), "judgeAttack", 948009124);
        setIntField(term49375, term49375.getClass(), "judgeJustice", 1688840379);
        setIntField(term49375, term49375.getClass(), "judgeCritical", -1811534908);
        setIntField(term49375, term49375.getClass(), "playerRating", -1024774970);
        setBooleanField(term49375, term49375.getClass(), "isNewRecord", false);
        setBooleanField(term49375, term49375.getClass(), "isFullCombo", true);
        setIntField(term49375, term49375.getClass(), "fullChainKind", 191435935);
        setBooleanField(term49375, term49375.getClass(), "isAllJustice", false);
        setIntField(term49375, term49375.getClass(), "characterId", -1320856251);
        setIntField(term49375, term49375.getClass(), "skillId", 957604584);
        setIntField(term49375, term49375.getClass(), "playKind", 1124496804);
        setBooleanField(term49375, term49375.getClass(), "isClear", false);
        setIntField(term49375, term49375.getClass(), "skillLevel", -792786703);
        setIntField(term49375, term49375.getClass(), "skillEffect", 331010013);
        term49427 = new Integer(275287586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49427;
        callMethod(klass, "setCharacterId", argTypes, term49375, args);
    }

};


