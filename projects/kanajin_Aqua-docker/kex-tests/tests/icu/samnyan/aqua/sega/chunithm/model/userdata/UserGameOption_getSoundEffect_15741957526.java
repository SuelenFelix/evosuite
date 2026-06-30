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

public class UserGameOption_getSoundEffect_15741957526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51421;

    public UserGameOption_getSoundEffect_15741957526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51427 = new Long(2701184207686293431L);
        term51421 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term51423 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term51425 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51446 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51478 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51633 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51421, term51421.getClass(), "id", -7876013692629304244L);
        setLongField(term51423, term51423.getClass(), "id", 8129782425142702673L);
        setLongField(term51425, term51425.getClass(), "id", -1348078265481224468L);
        setField(term51425, term51425.getClass(), "extId", term51427);
        setField(term51425, term51425.getClass(), "luid", "IPmndzGjtG");
        setIntField(term51442, term51442.getClass(), "year", 2012);
        setShortField(term51442, term51442.getClass(), "month", (short) 7);
        setShortField(term51442, term51442.getClass(), "day", (short) 23);
        setField(term51441, term51441.getClass(), "date", term51442);
        setByteField(term51446, term51446.getClass(), "hour", (byte) 8);
        setByteField(term51446, term51446.getClass(), "minute", (byte) 33);
        setByteField(term51446, term51446.getClass(), "second", (byte) 50);
        setIntField(term51446, term51446.getClass(), "nano", 663997596);
        setField(term51441, term51441.getClass(), "time", term51446);
        setField(term51425, term51425.getClass(), "registerTime", term51441);
        setIntField(term51452, term51452.getClass(), "year", 2018);
        setShortField(term51452, term51452.getClass(), "month", (short) 5);
        setShortField(term51452, term51452.getClass(), "day", (short) 18);
        setField(term51451, term51451.getClass(), "date", term51452);
        setByteField(term51456, term51456.getClass(), "hour", (byte) 22);
        setByteField(term51456, term51456.getClass(), "minute", (byte) 7);
        setByteField(term51456, term51456.getClass(), "second", (byte) 58);
        setIntField(term51456, term51456.getClass(), "nano", 802311880);
        setField(term51451, term51451.getClass(), "time", term51456);
        setField(term51425, term51425.getClass(), "accessTime", term51451);
        setField(term51423, term51423.getClass(), "card", term51425);
        setField(term51423, term51423.getClass(), "userName", "pkQiBgYrkQ");
        setIntField(term51474, term51474.getClass(), "year", 2012);
        setShortField(term51474, term51474.getClass(), "month", (short) 12);
        setShortField(term51474, term51474.getClass(), "day", (short) 5);
        setField(term51473, term51473.getClass(), "date", term51474);
        setByteField(term51478, term51478.getClass(), "hour", (byte) 23);
        setByteField(term51478, term51478.getClass(), "minute", (byte) 26);
        setByteField(term51478, term51478.getClass(), "second", (byte) 26);
        setIntField(term51478, term51478.getClass(), "nano", 226998623);
        setField(term51473, term51473.getClass(), "time", term51478);
        setField(term51423, term51423.getClass(), "lastLoginDate", term51473);
        setBooleanField(term51423, term51423.getClass(), "isWebJoin", false);
        setField(term51423, term51423.getClass(), "webLimitDate", "SJLRFsNagf");
        setIntField(term51423, term51423.getClass(), "level", -1559804880);
        setIntField(term51423, term51423.getClass(), "reincarnationNum", 420300457);
        setField(term51423, term51423.getClass(), "exp", "UsCZaSgXzI");
        setLongField(term51423, term51423.getClass(), "point", 7007517375697316368L);
        setLongField(term51423, term51423.getClass(), "totalPoint", 8485924987529500210L);
        setIntField(term51423, term51423.getClass(), "playCount", 804843661);
        setIntField(term51423, term51423.getClass(), "multiPlayCount", 1968236726);
        setIntField(term51423, term51423.getClass(), "multiWinCount", -1080686915);
        setIntField(term51423, term51423.getClass(), "requestResCount", -1329496162);
        setIntField(term51423, term51423.getClass(), "acceptResCount", -1181178091);
        setIntField(term51423, term51423.getClass(), "successResCount", 797166053);
        setIntField(term51423, term51423.getClass(), "playerRating", -1145342603);
        setIntField(term51423, term51423.getClass(), "highestRating", -1135326582);
        setIntField(term51423, term51423.getClass(), "nameplateId", 594267051);
        setIntField(term51423, term51423.getClass(), "frameId", -1225303838);
        setIntField(term51423, term51423.getClass(), "characterId", 1093956146);
        setIntField(term51423, term51423.getClass(), "trophyId", 1459247713);
        setIntField(term51423, term51423.getClass(), "playedTutorialBit", 1400302967);
        setIntField(term51423, term51423.getClass(), "firstTutorialCancelNum", 692198729);
        setIntField(term51423, term51423.getClass(), "masterTutorialCancelNum", -1232290301);
        setIntField(term51423, term51423.getClass(), "totalRepertoireCount", -1411058034);
        setIntField(term51423, term51423.getClass(), "totalMapNum", -144155597);
        setLongField(term51423, term51423.getClass(), "totalHiScore", 1397546230296552361L);
        setLongField(term51423, term51423.getClass(), "totalBasicHighScore", 4531694455151993856L);
        setLongField(term51423, term51423.getClass(), "totalAdvancedHighScore", 4543928187003669961L);
        setLongField(term51423, term51423.getClass(), "totalExpertHighScore", -1536013261126093321L);
        setLongField(term51423, term51423.getClass(), "totalMasterHighScore", 5953375436340093396L);
        setIntField(term51535, term51535.getClass(), "year", 2020);
        setShortField(term51535, term51535.getClass(), "month", (short) 4);
        setShortField(term51535, term51535.getClass(), "day", (short) 20);
        setField(term51534, term51534.getClass(), "date", term51535);
        setByteField(term51539, term51539.getClass(), "hour", (byte) 6);
        setByteField(term51539, term51539.getClass(), "minute", (byte) 10);
        setByteField(term51539, term51539.getClass(), "second", (byte) 52);
        setIntField(term51539, term51539.getClass(), "nano", 872227966);
        setField(term51534, term51534.getClass(), "time", term51539);
        setField(term51423, term51423.getClass(), "eventWatchedDate", term51534);
        setIntField(term51423, term51423.getClass(), "friendCount", -996670851);
        setBooleanField(term51423, term51423.getClass(), "isMaimai", true);
        setField(term51423, term51423.getClass(), "firstGameId", "IXZCeVwvBM");
        setField(term51423, term51423.getClass(), "firstRomVersion", "ElTdyUVQYi");
        setField(term51423, term51423.getClass(), "firstDataVersion", "KkgJnxXxVl");
        setIntField(term51583, term51583.getClass(), "year", 2013);
        setShortField(term51583, term51583.getClass(), "month", (short) 9);
        setShortField(term51583, term51583.getClass(), "day", (short) 12);
        setField(term51582, term51582.getClass(), "date", term51583);
        setByteField(term51587, term51587.getClass(), "hour", (byte) 19);
        setByteField(term51587, term51587.getClass(), "minute", (byte) 26);
        setByteField(term51587, term51587.getClass(), "second", (byte) 25);
        setIntField(term51587, term51587.getClass(), "nano", 897835144);
        setField(term51582, term51582.getClass(), "time", term51587);
        setField(term51423, term51423.getClass(), "firstPlayDate", term51582);
        setField(term51423, term51423.getClass(), "lastGameId", "TGnzPlGFMb");
        setField(term51423, term51423.getClass(), "lastRomVersion", "yEvLMSpdHy");
        setField(term51423, term51423.getClass(), "lastDataVersion", "qdErlZeTVv");
        setIntField(term51629, term51629.getClass(), "year", 2014);
        setShortField(term51629, term51629.getClass(), "month", (short) 6);
        setShortField(term51629, term51629.getClass(), "day", (short) 17);
        setField(term51628, term51628.getClass(), "date", term51629);
        setByteField(term51633, term51633.getClass(), "hour", (byte) 1);
        setByteField(term51633, term51633.getClass(), "minute", (byte) 42);
        setByteField(term51633, term51633.getClass(), "second", (byte) 16);
        setIntField(term51633, term51633.getClass(), "nano", 607959128);
        setField(term51628, term51628.getClass(), "time", term51633);
        setField(term51423, term51423.getClass(), "lastPlayDate", term51628);
        setIntField(term51423, term51423.getClass(), "lastPlaceId", 340642931);
        setField(term51423, term51423.getClass(), "lastPlaceName", "OCCDQbndDE");
        setField(term51423, term51423.getClass(), "lastRegionId", "NMANMKfctU");
        setField(term51423, term51423.getClass(), "lastRegionName", "mQsaqUltLU");
        setField(term51423, term51423.getClass(), "lastAllNetId", "jwENwZiGlR");
        setField(term51423, term51423.getClass(), "lastClientId", "rfFHGPcfpz");
        setField(term51421, term51421.getClass(), "user", term51423);
        setIntField(term51421, term51421.getClass(), "bgInfo", -2018441502);
        setIntField(term51421, term51421.getClass(), "fieldColor", -762480882);
        setIntField(term51421, term51421.getClass(), "guideSound", -263338308);
        setIntField(term51421, term51421.getClass(), "soundEffect", 1496385296);
        setIntField(term51421, term51421.getClass(), "guideLine", -1339659575);
        setIntField(term51421, term51421.getClass(), "speed", 2123597267);
        setIntField(term51421, term51421.getClass(), "optionSet", -147077267);
        setIntField(term51421, term51421.getClass(), "matching", -550222549);
        setIntField(term51421, term51421.getClass(), "judgePos", -499576898);
        setIntField(term51421, term51421.getClass(), "rating", -686129078);
        setIntField(term51421, term51421.getClass(), "judgeJustice", 1016118972);
        setIntField(term51421, term51421.getClass(), "judgeAttack", 1276607451);
        setIntField(term51421, term51421.getClass(), "headphone", -547325184);
        setIntField(term51421, term51421.getClass(), "playerLevel", 1470261214);
        setIntField(term51421, term51421.getClass(), "successTap", 1402619496);
        setIntField(term51421, term51421.getClass(), "successExTap", 1253501512);
        setIntField(term51421, term51421.getClass(), "successSlideHold", 594655877);
        setIntField(term51421, term51421.getClass(), "successAir", 281155455);
        setIntField(term51421, term51421.getClass(), "successFlick", 85079003);
        setIntField(term51421, term51421.getClass(), "successSkill", -2010823131);
        setIntField(term51421, term51421.getClass(), "successTapTimbre", -1368198865);
        setIntField(term51421, term51421.getClass(), "privacy", -14635574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoundEffect", argTypes, term51421, args);
    }

};


