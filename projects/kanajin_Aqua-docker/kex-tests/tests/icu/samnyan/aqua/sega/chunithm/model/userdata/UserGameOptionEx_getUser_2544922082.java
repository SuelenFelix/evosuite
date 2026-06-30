package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOptionEx_getUser_2544922082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310479;

    public UserGameOptionEx_getUser_2544922082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310485 = new Long(7893661350133453338L);
        term310479 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term310481 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term310483 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term310499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310504 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310597 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310691 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term310479, term310479.getClass(), "id", 6439867665349593917L);
        setLongField(term310481, term310481.getClass(), "id", 2080051965907831369L);
        setLongField(term310483, term310483.getClass(), "id", -4195585882125852631L);
        setField(term310483, term310483.getClass(), "extId", term310485);
        setField(term310483, term310483.getClass(), "luid", "JTfrTZUkVR");
        setIntField(term310500, term310500.getClass(), "year", 2011);
        setShortField(term310500, term310500.getClass(), "month", (short) 1);
        setShortField(term310500, term310500.getClass(), "day", (short) 27);
        setField(term310499, term310499.getClass(), "date", term310500);
        setByteField(term310504, term310504.getClass(), "hour", (byte) 16);
        setByteField(term310504, term310504.getClass(), "minute", (byte) 2);
        setByteField(term310504, term310504.getClass(), "second", (byte) 4);
        setIntField(term310504, term310504.getClass(), "nano", 868620645);
        setField(term310499, term310499.getClass(), "time", term310504);
        setField(term310483, term310483.getClass(), "registerTime", term310499);
        setIntField(term310510, term310510.getClass(), "year", 2018);
        setShortField(term310510, term310510.getClass(), "month", (short) 11);
        setShortField(term310510, term310510.getClass(), "day", (short) 16);
        setField(term310509, term310509.getClass(), "date", term310510);
        setByteField(term310514, term310514.getClass(), "hour", (byte) 0);
        setByteField(term310514, term310514.getClass(), "minute", (byte) 2);
        setByteField(term310514, term310514.getClass(), "second", (byte) 0);
        setIntField(term310514, term310514.getClass(), "nano", 59865195);
        setField(term310509, term310509.getClass(), "time", term310514);
        setField(term310483, term310483.getClass(), "accessTime", term310509);
        setField(term310481, term310481.getClass(), "card", term310483);
        setField(term310481, term310481.getClass(), "userName", "klkctrXEId");
        setIntField(term310532, term310532.getClass(), "year", 2016);
        setShortField(term310532, term310532.getClass(), "month", (short) 6);
        setShortField(term310532, term310532.getClass(), "day", (short) 1);
        setField(term310531, term310531.getClass(), "date", term310532);
        setByteField(term310536, term310536.getClass(), "hour", (byte) 19);
        setByteField(term310536, term310536.getClass(), "minute", (byte) 32);
        setByteField(term310536, term310536.getClass(), "second", (byte) 50);
        setIntField(term310536, term310536.getClass(), "nano", 14080704);
        setField(term310531, term310531.getClass(), "time", term310536);
        setField(term310481, term310481.getClass(), "lastLoginDate", term310531);
        setBooleanField(term310481, term310481.getClass(), "isWebJoin", false);
        setField(term310481, term310481.getClass(), "webLimitDate", "HITkgFdUxC");
        setIntField(term310481, term310481.getClass(), "level", 968050623);
        setIntField(term310481, term310481.getClass(), "reincarnationNum", -830087679);
        setField(term310481, term310481.getClass(), "exp", "JtTgctnzIb");
        setLongField(term310481, term310481.getClass(), "point", -7771426303082571181L);
        setLongField(term310481, term310481.getClass(), "totalPoint", -461329147930703249L);
        setIntField(term310481, term310481.getClass(), "playCount", -503037443);
        setIntField(term310481, term310481.getClass(), "multiPlayCount", 682268807);
        setIntField(term310481, term310481.getClass(), "multiWinCount", 136044547);
        setIntField(term310481, term310481.getClass(), "requestResCount", 464334734);
        setIntField(term310481, term310481.getClass(), "acceptResCount", 2070253003);
        setIntField(term310481, term310481.getClass(), "successResCount", 1634771150);
        setIntField(term310481, term310481.getClass(), "playerRating", 1103450812);
        setIntField(term310481, term310481.getClass(), "highestRating", 1483366240);
        setIntField(term310481, term310481.getClass(), "nameplateId", -808802177);
        setIntField(term310481, term310481.getClass(), "frameId", 201013869);
        setIntField(term310481, term310481.getClass(), "characterId", -695537447);
        setIntField(term310481, term310481.getClass(), "trophyId", -128642878);
        setIntField(term310481, term310481.getClass(), "playedTutorialBit", -153976766);
        setIntField(term310481, term310481.getClass(), "firstTutorialCancelNum", -822027858);
        setIntField(term310481, term310481.getClass(), "masterTutorialCancelNum", 487034633);
        setIntField(term310481, term310481.getClass(), "totalRepertoireCount", 660427537);
        setIntField(term310481, term310481.getClass(), "totalMapNum", 241613117);
        setLongField(term310481, term310481.getClass(), "totalHiScore", -8366220047794225218L);
        setLongField(term310481, term310481.getClass(), "totalBasicHighScore", 5938335049432738507L);
        setLongField(term310481, term310481.getClass(), "totalAdvancedHighScore", 8101424453166597716L);
        setLongField(term310481, term310481.getClass(), "totalExpertHighScore", -3794905176195309921L);
        setLongField(term310481, term310481.getClass(), "totalMasterHighScore", -3977066406545237877L);
        setIntField(term310593, term310593.getClass(), "year", 2015);
        setShortField(term310593, term310593.getClass(), "month", (short) 9);
        setShortField(term310593, term310593.getClass(), "day", (short) 12);
        setField(term310592, term310592.getClass(), "date", term310593);
        setByteField(term310597, term310597.getClass(), "hour", (byte) 23);
        setByteField(term310597, term310597.getClass(), "minute", (byte) 39);
        setByteField(term310597, term310597.getClass(), "second", (byte) 52);
        setIntField(term310597, term310597.getClass(), "nano", 358845115);
        setField(term310592, term310592.getClass(), "time", term310597);
        setField(term310481, term310481.getClass(), "eventWatchedDate", term310592);
        setIntField(term310481, term310481.getClass(), "friendCount", -1603478119);
        setBooleanField(term310481, term310481.getClass(), "isMaimai", true);
        setField(term310481, term310481.getClass(), "firstGameId", "jkqncveFue");
        setField(term310481, term310481.getClass(), "firstRomVersion", "ORAFZEKabw");
        setField(term310481, term310481.getClass(), "firstDataVersion", "lNHeCcQUrM");
        setIntField(term310641, term310641.getClass(), "year", 2018);
        setShortField(term310641, term310641.getClass(), "month", (short) 6);
        setShortField(term310641, term310641.getClass(), "day", (short) 17);
        setField(term310640, term310640.getClass(), "date", term310641);
        setByteField(term310645, term310645.getClass(), "hour", (byte) 20);
        setByteField(term310645, term310645.getClass(), "minute", (byte) 52);
        setByteField(term310645, term310645.getClass(), "second", (byte) 52);
        setIntField(term310645, term310645.getClass(), "nano", 187161648);
        setField(term310640, term310640.getClass(), "time", term310645);
        setField(term310481, term310481.getClass(), "firstPlayDate", term310640);
        setField(term310481, term310481.getClass(), "lastGameId", "xDzfsTlPyO");
        setField(term310481, term310481.getClass(), "lastRomVersion", "xtNbDPazRs");
        setField(term310481, term310481.getClass(), "lastDataVersion", "STfGRumXvX");
        setIntField(term310687, term310687.getClass(), "year", 2018);
        setShortField(term310687, term310687.getClass(), "month", (short) 5);
        setShortField(term310687, term310687.getClass(), "day", (short) 25);
        setField(term310686, term310686.getClass(), "date", term310687);
        setByteField(term310691, term310691.getClass(), "hour", (byte) 3);
        setByteField(term310691, term310691.getClass(), "minute", (byte) 34);
        setByteField(term310691, term310691.getClass(), "second", (byte) 57);
        setIntField(term310691, term310691.getClass(), "nano", 859359887);
        setField(term310686, term310686.getClass(), "time", term310691);
        setField(term310481, term310481.getClass(), "lastPlayDate", term310686);
        setIntField(term310481, term310481.getClass(), "lastPlaceId", -269576763);
        setField(term310481, term310481.getClass(), "lastPlaceName", "qoMGJyerSD");
        setField(term310481, term310481.getClass(), "lastRegionId", "YHHJhPAXoN");
        setField(term310481, term310481.getClass(), "lastRegionName", "nFsigFFmWc");
        setField(term310481, term310481.getClass(), "lastAllNetId", "qehgMPhJMU");
        setField(term310481, term310481.getClass(), "lastClientId", "IjpmHZDGJg");
        setField(term310479, term310479.getClass(), "user", term310481);
        setIntField(term310479, term310479.getClass(), "ext1", -1999959189);
        setIntField(term310479, term310479.getClass(), "ext2", -1872533700);
        setIntField(term310479, term310479.getClass(), "ext3", 1237512912);
        setIntField(term310479, term310479.getClass(), "ext4", 1251446163);
        setIntField(term310479, term310479.getClass(), "ext5", -2057452122);
        setIntField(term310479, term310479.getClass(), "ext6", 1691237773);
        setIntField(term310479, term310479.getClass(), "ext7", -1663742052);
        setIntField(term310479, term310479.getClass(), "ext8", 788507527);
        setIntField(term310479, term310479.getClass(), "ext9", -1612439420);
        setIntField(term310479, term310479.getClass(), "ext10", -914990802);
        setIntField(term310479, term310479.getClass(), "ext11", 865738050);
        setIntField(term310479, term310479.getClass(), "ext12", 28910093);
        setIntField(term310479, term310479.getClass(), "ext13", 157370660);
        setIntField(term310479, term310479.getClass(), "ext14", 2042890534);
        setIntField(term310479, term310479.getClass(), "ext15", -2049072485);
        setIntField(term310479, term310479.getClass(), "ext16", 1903704550);
        setIntField(term310479, term310479.getClass(), "ext17", -2075510342);
        setIntField(term310479, term310479.getClass(), "ext18", 1544698163);
        setIntField(term310479, term310479.getClass(), "ext19", -1789656093);
        setIntField(term310479, term310479.getClass(), "ext20", 1550481264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term310479, args);
    }

};


