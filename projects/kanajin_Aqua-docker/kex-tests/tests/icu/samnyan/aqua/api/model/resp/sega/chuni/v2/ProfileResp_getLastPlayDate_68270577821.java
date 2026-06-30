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

public class ProfileResp_getLastPlayDate_68270577821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117618;

    public ProfileResp_getLastPlayDate_68270577821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117618 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117676 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117618, term117618.getClass(), "userName", "wmMerZnJUw");
        setIntField(term117618, term117618.getClass(), "level", -1507004922);
        setField(term117618, term117618.getClass(), "exp", "ewUZPdbQIm");
        setLongField(term117618, term117618.getClass(), "point", -2642626234707592872L);
        setLongField(term117618, term117618.getClass(), "totalPoint", -7405060556842728806L);
        setIntField(term117618, term117618.getClass(), "playCount", -879401452);
        setIntField(term117618, term117618.getClass(), "playerRating", -1621876369);
        setIntField(term117618, term117618.getClass(), "highestRating", 1174336539);
        setIntField(term117618, term117618.getClass(), "nameplateId", 774423607);
        setIntField(term117618, term117618.getClass(), "frameId", -1264611497);
        setIntField(term117618, term117618.getClass(), "characterId", -1250061708);
        setIntField(term117618, term117618.getClass(), "trophyId", -1331395292);
        setIntField(term117618, term117618.getClass(), "totalMapNum", 269199203);
        setLongField(term117618, term117618.getClass(), "totalHiScore", -4527791479018516668L);
        setLongField(term117618, term117618.getClass(), "totalBasicHighScore", -2612967577904398834L);
        setLongField(term117618, term117618.getClass(), "totalAdvancedHighScore", -6151359199860064110L);
        setLongField(term117618, term117618.getClass(), "totalExpertHighScore", 7248988630031261484L);
        setLongField(term117618, term117618.getClass(), "totalMasterHighScore", 3319565167580239453L);
        setLongField(term117618, term117618.getClass(), "totalUltimaHighScore", 7665122090516509718L);
        setIntField(term117618, term117618.getClass(), "friendCount", -2005294441);
        setIntField(term117662, term117662.getClass(), "year", 2012);
        setShortField(term117662, term117662.getClass(), "month", (short) 10);
        setShortField(term117662, term117662.getClass(), "day", (short) 27);
        setField(term117661, term117661.getClass(), "date", term117662);
        setByteField(term117666, term117666.getClass(), "hour", (byte) 1);
        setByteField(term117666, term117666.getClass(), "minute", (byte) 17);
        setByteField(term117666, term117666.getClass(), "second", (byte) 22);
        setIntField(term117666, term117666.getClass(), "nano", 696035974);
        setField(term117661, term117661.getClass(), "time", term117666);
        setField(term117618, term117618.getClass(), "firstPlayDate", term117661);
        setIntField(term117672, term117672.getClass(), "year", 2020);
        setShortField(term117672, term117672.getClass(), "month", (short) 8);
        setShortField(term117672, term117672.getClass(), "day", (short) 28);
        setField(term117671, term117671.getClass(), "date", term117672);
        setByteField(term117676, term117676.getClass(), "hour", (byte) 12);
        setByteField(term117676, term117676.getClass(), "minute", (byte) 1);
        setByteField(term117676, term117676.getClass(), "second", (byte) 29);
        setIntField(term117676, term117676.getClass(), "nano", 657322206);
        setField(term117671, term117671.getClass(), "time", term117676);
        setField(term117618, term117618.getClass(), "lastPlayDate", term117671);
        setIntField(term117618, term117618.getClass(), "courseClass", 60578208);
        setIntField(term117618, term117618.getClass(), "overPowerPoint", 1570753359);
        setIntField(term117618, term117618.getClass(), "overPowerRate", -738565710);
        setIntField(term117618, term117618.getClass(), "mapIconId", 38861638);
        setIntField(term117618, term117618.getClass(), "voiceId", -1855425005);
        setIntField(term117618, term117618.getClass(), "avatarWear", 1559442953);
        setIntField(term117618, term117618.getClass(), "avatarHead", 877351648);
        setIntField(term117618, term117618.getClass(), "avatarFace", -1643057145);
        setIntField(term117618, term117618.getClass(), "avatarSkin", -1929379630);
        setIntField(term117618, term117618.getClass(), "avatarItem", -1070255402);
        setIntField(term117618, term117618.getClass(), "avatarFront", -1892651472);
        setIntField(term117618, term117618.getClass(), "avatarBack", 1826433940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term117618, args);
    }

};


