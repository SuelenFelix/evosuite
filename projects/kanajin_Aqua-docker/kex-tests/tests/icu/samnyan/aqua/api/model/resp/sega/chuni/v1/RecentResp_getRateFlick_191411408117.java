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

public class RecentResp_getRateFlick_191411408117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52239;

    public RecentResp_getRateFlick_191411408117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52239 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52255 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52241, term52241.getClass(), "year", 2014);
        setShortField(term52241, term52241.getClass(), "month", (short) 11);
        setShortField(term52241, term52241.getClass(), "day", (short) 16);
        setField(term52240, term52240.getClass(), "date", term52241);
        setByteField(term52245, term52245.getClass(), "hour", (byte) 22);
        setByteField(term52245, term52245.getClass(), "minute", (byte) 31);
        setByteField(term52245, term52245.getClass(), "second", (byte) 12);
        setIntField(term52245, term52245.getClass(), "nano", 196022579);
        setField(term52240, term52240.getClass(), "time", term52245);
        setField(term52239, term52239.getClass(), "playDate", term52240);
        setIntField(term52251, term52251.getClass(), "year", 2020);
        setShortField(term52251, term52251.getClass(), "month", (short) 4);
        setShortField(term52251, term52251.getClass(), "day", (short) 19);
        setField(term52250, term52250.getClass(), "date", term52251);
        setByteField(term52255, term52255.getClass(), "hour", (byte) 5);
        setByteField(term52255, term52255.getClass(), "minute", (byte) 30);
        setByteField(term52255, term52255.getClass(), "second", (byte) 22);
        setIntField(term52255, term52255.getClass(), "nano", 839145960);
        setField(term52250, term52250.getClass(), "time", term52255);
        setField(term52239, term52239.getClass(), "userPlayDate", term52250);
        setIntField(term52239, term52239.getClass(), "musicId", -677712787);
        setIntField(term52239, term52239.getClass(), "level", -473854701);
        setIntField(term52239, term52239.getClass(), "customId", -193355905);
        setIntField(term52239, term52239.getClass(), "playedCustom1", -104223978);
        setIntField(term52239, term52239.getClass(), "playedCustom2", 192932780);
        setIntField(term52239, term52239.getClass(), "playedCustom3", -902517932);
        setIntField(term52239, term52239.getClass(), "track", 2043141938);
        setIntField(term52239, term52239.getClass(), "score", 51110531);
        setIntField(term52239, term52239.getClass(), "rank", -142424158);
        setIntField(term52239, term52239.getClass(), "maxCombo", 360866091);
        setIntField(term52239, term52239.getClass(), "maxChain", -1711966798);
        setIntField(term52239, term52239.getClass(), "rateTap", 414375178);
        setIntField(term52239, term52239.getClass(), "rateHold", -189623871);
        setIntField(term52239, term52239.getClass(), "rateSlide", -1500608395);
        setIntField(term52239, term52239.getClass(), "rateAir", -1957666898);
        setIntField(term52239, term52239.getClass(), "rateFlick", -1073146570);
        setIntField(term52239, term52239.getClass(), "judgeGuilty", -898083613);
        setIntField(term52239, term52239.getClass(), "judgeAttack", 1072590759);
        setIntField(term52239, term52239.getClass(), "judgeJustice", -261873217);
        setIntField(term52239, term52239.getClass(), "judgeCritical", 275234848);
        setIntField(term52239, term52239.getClass(), "playerRating", -400500781);
        setBooleanField(term52239, term52239.getClass(), "isNewRecord", false);
        setBooleanField(term52239, term52239.getClass(), "isFullCombo", false);
        setIntField(term52239, term52239.getClass(), "fullChainKind", -1811725314);
        setBooleanField(term52239, term52239.getClass(), "isAllJustice", false);
        setIntField(term52239, term52239.getClass(), "characterId", -1802258300);
        setIntField(term52239, term52239.getClass(), "skillId", -407739204);
        setIntField(term52239, term52239.getClass(), "playKind", 551650321);
        setBooleanField(term52239, term52239.getClass(), "isClear", false);
        setIntField(term52239, term52239.getClass(), "skillLevel", 1863609082);
        setIntField(term52239, term52239.getClass(), "skillEffect", 346023694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateFlick", argTypes, term52239, args);
    }

};


