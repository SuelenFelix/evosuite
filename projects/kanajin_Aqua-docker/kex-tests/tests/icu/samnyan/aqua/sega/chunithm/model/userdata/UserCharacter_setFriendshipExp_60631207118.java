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
import java.lang.Integer;

public class UserCharacter_setFriendshipExp_60631207118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116336;
     Object term116623;

    public UserCharacter_setFriendshipExp_60631207118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116342 = new Long(6902365338255307910L);
        term116336 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term116338 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term116340 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116371 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116502 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116548 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116336, term116336.getClass(), "id", 1968564047271987662L);
        setLongField(term116338, term116338.getClass(), "id", 3358595188795083828L);
        setLongField(term116340, term116340.getClass(), "id", -2657370804250344298L);
        setField(term116340, term116340.getClass(), "extId", term116342);
        setField(term116340, term116340.getClass(), "luid", "NFhdyebxdy");
        setIntField(term116357, term116357.getClass(), "year", 2012);
        setShortField(term116357, term116357.getClass(), "month", (short) 12);
        setShortField(term116357, term116357.getClass(), "day", (short) 12);
        setField(term116356, term116356.getClass(), "date", term116357);
        setByteField(term116361, term116361.getClass(), "hour", (byte) 17);
        setByteField(term116361, term116361.getClass(), "minute", (byte) 21);
        setByteField(term116361, term116361.getClass(), "second", (byte) 4);
        setIntField(term116361, term116361.getClass(), "nano", 716958293);
        setField(term116356, term116356.getClass(), "time", term116361);
        setField(term116340, term116340.getClass(), "registerTime", term116356);
        setIntField(term116367, term116367.getClass(), "year", 2019);
        setShortField(term116367, term116367.getClass(), "month", (short) 7);
        setShortField(term116367, term116367.getClass(), "day", (short) 17);
        setField(term116366, term116366.getClass(), "date", term116367);
        setByteField(term116371, term116371.getClass(), "hour", (byte) 5);
        setByteField(term116371, term116371.getClass(), "minute", (byte) 18);
        setByteField(term116371, term116371.getClass(), "second", (byte) 23);
        setIntField(term116371, term116371.getClass(), "nano", 754719734);
        setField(term116366, term116366.getClass(), "time", term116371);
        setField(term116340, term116340.getClass(), "accessTime", term116366);
        setField(term116338, term116338.getClass(), "card", term116340);
        setField(term116338, term116338.getClass(), "userName", "tLWbdOibIF");
        setIntField(term116389, term116389.getClass(), "year", 2013);
        setShortField(term116389, term116389.getClass(), "month", (short) 5);
        setShortField(term116389, term116389.getClass(), "day", (short) 10);
        setField(term116388, term116388.getClass(), "date", term116389);
        setByteField(term116393, term116393.getClass(), "hour", (byte) 10);
        setByteField(term116393, term116393.getClass(), "minute", (byte) 43);
        setByteField(term116393, term116393.getClass(), "second", (byte) 24);
        setIntField(term116393, term116393.getClass(), "nano", 908301019);
        setField(term116388, term116388.getClass(), "time", term116393);
        setField(term116338, term116338.getClass(), "lastLoginDate", term116388);
        setBooleanField(term116338, term116338.getClass(), "isWebJoin", false);
        setField(term116338, term116338.getClass(), "webLimitDate", "SMOAkwbjOJ");
        setIntField(term116338, term116338.getClass(), "level", -1062988764);
        setIntField(term116338, term116338.getClass(), "reincarnationNum", 2034417479);
        setField(term116338, term116338.getClass(), "exp", "MfaucIGOtB");
        setLongField(term116338, term116338.getClass(), "point", 7829010818183645401L);
        setLongField(term116338, term116338.getClass(), "totalPoint", 1440127173650606212L);
        setIntField(term116338, term116338.getClass(), "playCount", 1064150907);
        setIntField(term116338, term116338.getClass(), "multiPlayCount", -1331960420);
        setIntField(term116338, term116338.getClass(), "multiWinCount", -1210634724);
        setIntField(term116338, term116338.getClass(), "requestResCount", -508178169);
        setIntField(term116338, term116338.getClass(), "acceptResCount", -2091925472);
        setIntField(term116338, term116338.getClass(), "successResCount", 1232275249);
        setIntField(term116338, term116338.getClass(), "playerRating", 1267736108);
        setIntField(term116338, term116338.getClass(), "highestRating", 1090073448);
        setIntField(term116338, term116338.getClass(), "nameplateId", 1691233507);
        setIntField(term116338, term116338.getClass(), "frameId", 1543785405);
        setIntField(term116338, term116338.getClass(), "characterId", -20379967);
        setIntField(term116338, term116338.getClass(), "trophyId", 1331697372);
        setIntField(term116338, term116338.getClass(), "playedTutorialBit", 636147978);
        setIntField(term116338, term116338.getClass(), "firstTutorialCancelNum", -154767845);
        setIntField(term116338, term116338.getClass(), "masterTutorialCancelNum", 296334503);
        setIntField(term116338, term116338.getClass(), "totalRepertoireCount", -1521936744);
        setIntField(term116338, term116338.getClass(), "totalMapNum", 681716275);
        setLongField(term116338, term116338.getClass(), "totalHiScore", -4277660344437377425L);
        setLongField(term116338, term116338.getClass(), "totalBasicHighScore", -3580500087222234204L);
        setLongField(term116338, term116338.getClass(), "totalAdvancedHighScore", 5608996079421235543L);
        setLongField(term116338, term116338.getClass(), "totalExpertHighScore", 8528484863342605856L);
        setLongField(term116338, term116338.getClass(), "totalMasterHighScore", -5895312352966511908L);
        setIntField(term116450, term116450.getClass(), "year", 2015);
        setShortField(term116450, term116450.getClass(), "month", (short) 11);
        setShortField(term116450, term116450.getClass(), "day", (short) 13);
        setField(term116449, term116449.getClass(), "date", term116450);
        setByteField(term116454, term116454.getClass(), "hour", (byte) 14);
        setByteField(term116454, term116454.getClass(), "minute", (byte) 45);
        setByteField(term116454, term116454.getClass(), "second", (byte) 47);
        setIntField(term116454, term116454.getClass(), "nano", 629262088);
        setField(term116449, term116449.getClass(), "time", term116454);
        setField(term116338, term116338.getClass(), "eventWatchedDate", term116449);
        setIntField(term116338, term116338.getClass(), "friendCount", -1564295844);
        setBooleanField(term116338, term116338.getClass(), "isMaimai", false);
        setField(term116338, term116338.getClass(), "firstGameId", "InUomUyBlU");
        setField(term116338, term116338.getClass(), "firstRomVersion", "JeDxEhXsPC");
        setField(term116338, term116338.getClass(), "firstDataVersion", "VAGxXrcAsi");
        setIntField(term116498, term116498.getClass(), "year", 2022);
        setShortField(term116498, term116498.getClass(), "month", (short) 5);
        setShortField(term116498, term116498.getClass(), "day", (short) 21);
        setField(term116497, term116497.getClass(), "date", term116498);
        setByteField(term116502, term116502.getClass(), "hour", (byte) 21);
        setByteField(term116502, term116502.getClass(), "minute", (byte) 29);
        setByteField(term116502, term116502.getClass(), "second", (byte) 7);
        setIntField(term116502, term116502.getClass(), "nano", 444139028);
        setField(term116497, term116497.getClass(), "time", term116502);
        setField(term116338, term116338.getClass(), "firstPlayDate", term116497);
        setField(term116338, term116338.getClass(), "lastGameId", "ApYkVuFRIL");
        setField(term116338, term116338.getClass(), "lastRomVersion", "diuhMpMKFr");
        setField(term116338, term116338.getClass(), "lastDataVersion", "jYgdYPEnbw");
        setIntField(term116544, term116544.getClass(), "year", 2010);
        setShortField(term116544, term116544.getClass(), "month", (short) 9);
        setShortField(term116544, term116544.getClass(), "day", (short) 20);
        setField(term116543, term116543.getClass(), "date", term116544);
        setByteField(term116548, term116548.getClass(), "hour", (byte) 1);
        setByteField(term116548, term116548.getClass(), "minute", (byte) 20);
        setByteField(term116548, term116548.getClass(), "second", (byte) 39);
        setIntField(term116548, term116548.getClass(), "nano", 127513393);
        setField(term116543, term116543.getClass(), "time", term116548);
        setField(term116338, term116338.getClass(), "lastPlayDate", term116543);
        setIntField(term116338, term116338.getClass(), "lastPlaceId", 808812678);
        setField(term116338, term116338.getClass(), "lastPlaceName", "MaWPQSNeis");
        setField(term116338, term116338.getClass(), "lastRegionId", "SiShLTAOSK");
        setField(term116338, term116338.getClass(), "lastRegionName", "FAPbpaVZzb");
        setField(term116338, term116338.getClass(), "lastAllNetId", "jMmGJiFUkL");
        setField(term116338, term116338.getClass(), "lastClientId", "fHyUJhfoxR");
        setField(term116336, term116336.getClass(), "user", term116338);
        setIntField(term116336, term116336.getClass(), "characterId", -1317808688);
        setIntField(term116336, term116336.getClass(), "playCount", -1064589449);
        setIntField(term116336, term116336.getClass(), "level", 1);
        setIntField(term116336, term116336.getClass(), "skillId", 1213636383);
        setIntField(term116336, term116336.getClass(), "friendshipExp", -1321778001);
        setBooleanField(term116336, term116336.getClass(), "isValid", true);
        setBooleanField(term116336, term116336.getClass(), "isNewMark", true);
        setIntField(term116336, term116336.getClass(), "param1", 183942181);
        setIntField(term116336, term116336.getClass(), "param2", 851144395);
        term116623 = new Integer(-1579523291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term116623;
        callMethod(klass, "setFriendshipExp", argTypes, term116336, args);
    }

};


