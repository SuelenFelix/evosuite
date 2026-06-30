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

public class UserGameOption_getBgInfo_20641499273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50071;

    public UserGameOption_getBgInfo_20641499273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50077 = new Long(-1983291584002806658L);
        term50071 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term50073 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term50075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50237 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50283 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50071, term50071.getClass(), "id", 8298987863520566549L);
        setLongField(term50073, term50073.getClass(), "id", 4361302085818491893L);
        setLongField(term50075, term50075.getClass(), "id", -2025074482272457806L);
        setField(term50075, term50075.getClass(), "extId", term50077);
        setField(term50075, term50075.getClass(), "luid", "zqykonsLIo");
        setIntField(term50092, term50092.getClass(), "year", 2019);
        setShortField(term50092, term50092.getClass(), "month", (short) 8);
        setShortField(term50092, term50092.getClass(), "day", (short) 6);
        setField(term50091, term50091.getClass(), "date", term50092);
        setByteField(term50096, term50096.getClass(), "hour", (byte) 19);
        setByteField(term50096, term50096.getClass(), "minute", (byte) 30);
        setByteField(term50096, term50096.getClass(), "second", (byte) 36);
        setIntField(term50096, term50096.getClass(), "nano", 118147558);
        setField(term50091, term50091.getClass(), "time", term50096);
        setField(term50075, term50075.getClass(), "registerTime", term50091);
        setIntField(term50102, term50102.getClass(), "year", 2010);
        setShortField(term50102, term50102.getClass(), "month", (short) 11);
        setShortField(term50102, term50102.getClass(), "day", (short) 17);
        setField(term50101, term50101.getClass(), "date", term50102);
        setByteField(term50106, term50106.getClass(), "hour", (byte) 7);
        setByteField(term50106, term50106.getClass(), "minute", (byte) 36);
        setByteField(term50106, term50106.getClass(), "second", (byte) 53);
        setIntField(term50106, term50106.getClass(), "nano", 316643445);
        setField(term50101, term50101.getClass(), "time", term50106);
        setField(term50075, term50075.getClass(), "accessTime", term50101);
        setField(term50073, term50073.getClass(), "card", term50075);
        setField(term50073, term50073.getClass(), "userName", "KoPzTuvIeK");
        setIntField(term50124, term50124.getClass(), "year", 2016);
        setShortField(term50124, term50124.getClass(), "month", (short) 1);
        setShortField(term50124, term50124.getClass(), "day", (short) 2);
        setField(term50123, term50123.getClass(), "date", term50124);
        setByteField(term50128, term50128.getClass(), "hour", (byte) 13);
        setByteField(term50128, term50128.getClass(), "minute", (byte) 24);
        setByteField(term50128, term50128.getClass(), "second", (byte) 10);
        setIntField(term50128, term50128.getClass(), "nano", 70073780);
        setField(term50123, term50123.getClass(), "time", term50128);
        setField(term50073, term50073.getClass(), "lastLoginDate", term50123);
        setBooleanField(term50073, term50073.getClass(), "isWebJoin", true);
        setField(term50073, term50073.getClass(), "webLimitDate", "SMoWUILIhn");
        setIntField(term50073, term50073.getClass(), "level", -1173622754);
        setIntField(term50073, term50073.getClass(), "reincarnationNum", -654564305);
        setField(term50073, term50073.getClass(), "exp", "SvSKSCjgTM");
        setLongField(term50073, term50073.getClass(), "point", -5564465000971559787L);
        setLongField(term50073, term50073.getClass(), "totalPoint", -6320896470659278539L);
        setIntField(term50073, term50073.getClass(), "playCount", -1985017499);
        setIntField(term50073, term50073.getClass(), "multiPlayCount", 1959598890);
        setIntField(term50073, term50073.getClass(), "multiWinCount", -920963609);
        setIntField(term50073, term50073.getClass(), "requestResCount", -724930680);
        setIntField(term50073, term50073.getClass(), "acceptResCount", -1859413089);
        setIntField(term50073, term50073.getClass(), "successResCount", -288823387);
        setIntField(term50073, term50073.getClass(), "playerRating", 1565022809);
        setIntField(term50073, term50073.getClass(), "highestRating", 286088345);
        setIntField(term50073, term50073.getClass(), "nameplateId", -1958895309);
        setIntField(term50073, term50073.getClass(), "frameId", -639022235);
        setIntField(term50073, term50073.getClass(), "characterId", -1063872965);
        setIntField(term50073, term50073.getClass(), "trophyId", 804907633);
        setIntField(term50073, term50073.getClass(), "playedTutorialBit", -937521678);
        setIntField(term50073, term50073.getClass(), "firstTutorialCancelNum", 194707851);
        setIntField(term50073, term50073.getClass(), "masterTutorialCancelNum", 806877632);
        setIntField(term50073, term50073.getClass(), "totalRepertoireCount", -1198681384);
        setIntField(term50073, term50073.getClass(), "totalMapNum", 1224777627);
        setLongField(term50073, term50073.getClass(), "totalHiScore", 1357834364621364655L);
        setLongField(term50073, term50073.getClass(), "totalBasicHighScore", 5242528388479853404L);
        setLongField(term50073, term50073.getClass(), "totalAdvancedHighScore", -9094760859641883612L);
        setLongField(term50073, term50073.getClass(), "totalExpertHighScore", 1789068809283154146L);
        setLongField(term50073, term50073.getClass(), "totalMasterHighScore", -6776970214701629330L);
        setIntField(term50185, term50185.getClass(), "year", 2013);
        setShortField(term50185, term50185.getClass(), "month", (short) 2);
        setShortField(term50185, term50185.getClass(), "day", (short) 21);
        setField(term50184, term50184.getClass(), "date", term50185);
        setByteField(term50189, term50189.getClass(), "hour", (byte) 4);
        setByteField(term50189, term50189.getClass(), "minute", (byte) 18);
        setByteField(term50189, term50189.getClass(), "second", (byte) 6);
        setIntField(term50189, term50189.getClass(), "nano", 2952762);
        setField(term50184, term50184.getClass(), "time", term50189);
        setField(term50073, term50073.getClass(), "eventWatchedDate", term50184);
        setIntField(term50073, term50073.getClass(), "friendCount", -1771549367);
        setBooleanField(term50073, term50073.getClass(), "isMaimai", true);
        setField(term50073, term50073.getClass(), "firstGameId", "UFxnRbWtog");
        setField(term50073, term50073.getClass(), "firstRomVersion", "NSxzAUSujy");
        setField(term50073, term50073.getClass(), "firstDataVersion", "FEezgglqXC");
        setIntField(term50233, term50233.getClass(), "year", 2016);
        setShortField(term50233, term50233.getClass(), "month", (short) 5);
        setShortField(term50233, term50233.getClass(), "day", (short) 9);
        setField(term50232, term50232.getClass(), "date", term50233);
        setByteField(term50237, term50237.getClass(), "hour", (byte) 22);
        setByteField(term50237, term50237.getClass(), "minute", (byte) 50);
        setByteField(term50237, term50237.getClass(), "second", (byte) 14);
        setIntField(term50237, term50237.getClass(), "nano", 185148211);
        setField(term50232, term50232.getClass(), "time", term50237);
        setField(term50073, term50073.getClass(), "firstPlayDate", term50232);
        setField(term50073, term50073.getClass(), "lastGameId", "rvYqMRgiPA");
        setField(term50073, term50073.getClass(), "lastRomVersion", "qOZXeUUmdz");
        setField(term50073, term50073.getClass(), "lastDataVersion", "FCovVZHqPx");
        setIntField(term50279, term50279.getClass(), "year", 2014);
        setShortField(term50279, term50279.getClass(), "month", (short) 3);
        setShortField(term50279, term50279.getClass(), "day", (short) 7);
        setField(term50278, term50278.getClass(), "date", term50279);
        setByteField(term50283, term50283.getClass(), "hour", (byte) 2);
        setByteField(term50283, term50283.getClass(), "minute", (byte) 57);
        setByteField(term50283, term50283.getClass(), "second", (byte) 26);
        setIntField(term50283, term50283.getClass(), "nano", 493613741);
        setField(term50278, term50278.getClass(), "time", term50283);
        setField(term50073, term50073.getClass(), "lastPlayDate", term50278);
        setIntField(term50073, term50073.getClass(), "lastPlaceId", -83563931);
        setField(term50073, term50073.getClass(), "lastPlaceName", "jSTBfkWjge");
        setField(term50073, term50073.getClass(), "lastRegionId", "uKYhZULSHp");
        setField(term50073, term50073.getClass(), "lastRegionName", "xdYuLllgpn");
        setField(term50073, term50073.getClass(), "lastAllNetId", "ayonlqalLA");
        setField(term50073, term50073.getClass(), "lastClientId", "fzzIOVxKdF");
        setField(term50071, term50071.getClass(), "user", term50073);
        setIntField(term50071, term50071.getClass(), "bgInfo", 1175147923);
        setIntField(term50071, term50071.getClass(), "fieldColor", -1424244263);
        setIntField(term50071, term50071.getClass(), "guideSound", 808665285);
        setIntField(term50071, term50071.getClass(), "soundEffect", 2003642877);
        setIntField(term50071, term50071.getClass(), "guideLine", -1574456346);
        setIntField(term50071, term50071.getClass(), "speed", 638598511);
        setIntField(term50071, term50071.getClass(), "optionSet", -946663870);
        setIntField(term50071, term50071.getClass(), "matching", 1997126409);
        setIntField(term50071, term50071.getClass(), "judgePos", 1794793561);
        setIntField(term50071, term50071.getClass(), "rating", 1483253425);
        setIntField(term50071, term50071.getClass(), "judgeJustice", -1101871231);
        setIntField(term50071, term50071.getClass(), "judgeAttack", 928527949);
        setIntField(term50071, term50071.getClass(), "headphone", 435463871);
        setIntField(term50071, term50071.getClass(), "playerLevel", -72892619);
        setIntField(term50071, term50071.getClass(), "successTap", 907161445);
        setIntField(term50071, term50071.getClass(), "successExTap", -107125345);
        setIntField(term50071, term50071.getClass(), "successSlideHold", -1484271501);
        setIntField(term50071, term50071.getClass(), "successAir", 1994800842);
        setIntField(term50071, term50071.getClass(), "successFlick", 418349525);
        setIntField(term50071, term50071.getClass(), "successSkill", 989214721);
        setIntField(term50071, term50071.getClass(), "successTapTimbre", 1509604);
        setIntField(term50071, term50071.getClass(), "privacy", 516929449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBgInfo", argTypes, term50071, args);
    }

};


