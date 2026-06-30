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

public class UserGameOptionEx_getExt14_157173888716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316751;

    public UserGameOptionEx_getExt14_157173888716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316757 = new Long(-6314099457945626605L);
        term316751 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term316753 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term316755 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term316771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316963 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term316751, term316751.getClass(), "id", 343175520811675132L);
        setLongField(term316753, term316753.getClass(), "id", 6625317914216873577L);
        setLongField(term316755, term316755.getClass(), "id", -695735546007856732L);
        setField(term316755, term316755.getClass(), "extId", term316757);
        setField(term316755, term316755.getClass(), "luid", "vqgXCbtNCu");
        setIntField(term316772, term316772.getClass(), "year", 2023);
        setShortField(term316772, term316772.getClass(), "month", (short) 5);
        setShortField(term316772, term316772.getClass(), "day", (short) 1);
        setField(term316771, term316771.getClass(), "date", term316772);
        setByteField(term316776, term316776.getClass(), "hour", (byte) 1);
        setByteField(term316776, term316776.getClass(), "minute", (byte) 27);
        setByteField(term316776, term316776.getClass(), "second", (byte) 21);
        setIntField(term316776, term316776.getClass(), "nano", 206758010);
        setField(term316771, term316771.getClass(), "time", term316776);
        setField(term316755, term316755.getClass(), "registerTime", term316771);
        setIntField(term316782, term316782.getClass(), "year", 2020);
        setShortField(term316782, term316782.getClass(), "month", (short) 9);
        setShortField(term316782, term316782.getClass(), "day", (short) 6);
        setField(term316781, term316781.getClass(), "date", term316782);
        setByteField(term316786, term316786.getClass(), "hour", (byte) 8);
        setByteField(term316786, term316786.getClass(), "minute", (byte) 28);
        setByteField(term316786, term316786.getClass(), "second", (byte) 0);
        setIntField(term316786, term316786.getClass(), "nano", 398133060);
        setField(term316781, term316781.getClass(), "time", term316786);
        setField(term316755, term316755.getClass(), "accessTime", term316781);
        setField(term316753, term316753.getClass(), "card", term316755);
        setField(term316753, term316753.getClass(), "userName", "kpkWNprGhK");
        setIntField(term316804, term316804.getClass(), "year", 2018);
        setShortField(term316804, term316804.getClass(), "month", (short) 4);
        setShortField(term316804, term316804.getClass(), "day", (short) 21);
        setField(term316803, term316803.getClass(), "date", term316804);
        setByteField(term316808, term316808.getClass(), "hour", (byte) 23);
        setByteField(term316808, term316808.getClass(), "minute", (byte) 32);
        setByteField(term316808, term316808.getClass(), "second", (byte) 27);
        setIntField(term316808, term316808.getClass(), "nano", 581402378);
        setField(term316803, term316803.getClass(), "time", term316808);
        setField(term316753, term316753.getClass(), "lastLoginDate", term316803);
        setBooleanField(term316753, term316753.getClass(), "isWebJoin", false);
        setField(term316753, term316753.getClass(), "webLimitDate", "AJmMrhkCkE");
        setIntField(term316753, term316753.getClass(), "level", -974141882);
        setIntField(term316753, term316753.getClass(), "reincarnationNum", -1827802290);
        setField(term316753, term316753.getClass(), "exp", "aaAOXoTImC");
        setLongField(term316753, term316753.getClass(), "point", 19203646627691674L);
        setLongField(term316753, term316753.getClass(), "totalPoint", 2498965757990557215L);
        setIntField(term316753, term316753.getClass(), "playCount", 1663558379);
        setIntField(term316753, term316753.getClass(), "multiPlayCount", 1578346029);
        setIntField(term316753, term316753.getClass(), "multiWinCount", -1278952384);
        setIntField(term316753, term316753.getClass(), "requestResCount", -816405586);
        setIntField(term316753, term316753.getClass(), "acceptResCount", -1535935345);
        setIntField(term316753, term316753.getClass(), "successResCount", -1386264680);
        setIntField(term316753, term316753.getClass(), "playerRating", -1542924803);
        setIntField(term316753, term316753.getClass(), "highestRating", 823893692);
        setIntField(term316753, term316753.getClass(), "nameplateId", 1766080609);
        setIntField(term316753, term316753.getClass(), "frameId", 642859580);
        setIntField(term316753, term316753.getClass(), "characterId", 1619698611);
        setIntField(term316753, term316753.getClass(), "trophyId", -1637017242);
        setIntField(term316753, term316753.getClass(), "playedTutorialBit", -1732584815);
        setIntField(term316753, term316753.getClass(), "firstTutorialCancelNum", -273142441);
        setIntField(term316753, term316753.getClass(), "masterTutorialCancelNum", 728509038);
        setIntField(term316753, term316753.getClass(), "totalRepertoireCount", 1888689930);
        setIntField(term316753, term316753.getClass(), "totalMapNum", -40146090);
        setLongField(term316753, term316753.getClass(), "totalHiScore", -5106579524454203545L);
        setLongField(term316753, term316753.getClass(), "totalBasicHighScore", -3215429352927471044L);
        setLongField(term316753, term316753.getClass(), "totalAdvancedHighScore", 8159541472648236739L);
        setLongField(term316753, term316753.getClass(), "totalExpertHighScore", 2973404116146321671L);
        setLongField(term316753, term316753.getClass(), "totalMasterHighScore", -8841313716709034325L);
        setIntField(term316865, term316865.getClass(), "year", 2024);
        setShortField(term316865, term316865.getClass(), "month", (short) 12);
        setShortField(term316865, term316865.getClass(), "day", (short) 5);
        setField(term316864, term316864.getClass(), "date", term316865);
        setByteField(term316869, term316869.getClass(), "hour", (byte) 14);
        setByteField(term316869, term316869.getClass(), "minute", (byte) 1);
        setByteField(term316869, term316869.getClass(), "second", (byte) 24);
        setIntField(term316869, term316869.getClass(), "nano", 139871251);
        setField(term316864, term316864.getClass(), "time", term316869);
        setField(term316753, term316753.getClass(), "eventWatchedDate", term316864);
        setIntField(term316753, term316753.getClass(), "friendCount", -626927749);
        setBooleanField(term316753, term316753.getClass(), "isMaimai", true);
        setField(term316753, term316753.getClass(), "firstGameId", "utpjeiiGQI");
        setField(term316753, term316753.getClass(), "firstRomVersion", "pssWvXujgp");
        setField(term316753, term316753.getClass(), "firstDataVersion", "EdNwugyvnG");
        setIntField(term316913, term316913.getClass(), "year", 2011);
        setShortField(term316913, term316913.getClass(), "month", (short) 4);
        setShortField(term316913, term316913.getClass(), "day", (short) 7);
        setField(term316912, term316912.getClass(), "date", term316913);
        setByteField(term316917, term316917.getClass(), "hour", (byte) 1);
        setByteField(term316917, term316917.getClass(), "minute", (byte) 11);
        setByteField(term316917, term316917.getClass(), "second", (byte) 58);
        setIntField(term316917, term316917.getClass(), "nano", 409645152);
        setField(term316912, term316912.getClass(), "time", term316917);
        setField(term316753, term316753.getClass(), "firstPlayDate", term316912);
        setField(term316753, term316753.getClass(), "lastGameId", "SzBvOdpmGj");
        setField(term316753, term316753.getClass(), "lastRomVersion", "hyIqGTzCGV");
        setField(term316753, term316753.getClass(), "lastDataVersion", "neTMUkKvtF");
        setIntField(term316959, term316959.getClass(), "year", 2028);
        setShortField(term316959, term316959.getClass(), "month", (short) 10);
        setShortField(term316959, term316959.getClass(), "day", (short) 11);
        setField(term316958, term316958.getClass(), "date", term316959);
        setByteField(term316963, term316963.getClass(), "hour", (byte) 10);
        setByteField(term316963, term316963.getClass(), "minute", (byte) 1);
        setByteField(term316963, term316963.getClass(), "second", (byte) 39);
        setIntField(term316963, term316963.getClass(), "nano", 914211631);
        setField(term316958, term316958.getClass(), "time", term316963);
        setField(term316753, term316753.getClass(), "lastPlayDate", term316958);
        setIntField(term316753, term316753.getClass(), "lastPlaceId", -2047201412);
        setField(term316753, term316753.getClass(), "lastPlaceName", "gOcGTGkmIA");
        setField(term316753, term316753.getClass(), "lastRegionId", "aIdjgZqQLf");
        setField(term316753, term316753.getClass(), "lastRegionName", "SzZxkTtjzT");
        setField(term316753, term316753.getClass(), "lastAllNetId", "bqUMcVqQmH");
        setField(term316753, term316753.getClass(), "lastClientId", "xhUxsrKBUI");
        setField(term316751, term316751.getClass(), "user", term316753);
        setIntField(term316751, term316751.getClass(), "ext1", -1012628729);
        setIntField(term316751, term316751.getClass(), "ext2", -754099477);
        setIntField(term316751, term316751.getClass(), "ext3", -1808522184);
        setIntField(term316751, term316751.getClass(), "ext4", -1155377654);
        setIntField(term316751, term316751.getClass(), "ext5", 346216337);
        setIntField(term316751, term316751.getClass(), "ext6", -1716131367);
        setIntField(term316751, term316751.getClass(), "ext7", 910790938);
        setIntField(term316751, term316751.getClass(), "ext8", 981136142);
        setIntField(term316751, term316751.getClass(), "ext9", 442400196);
        setIntField(term316751, term316751.getClass(), "ext10", -2118844036);
        setIntField(term316751, term316751.getClass(), "ext11", 1025283541);
        setIntField(term316751, term316751.getClass(), "ext12", -224806040);
        setIntField(term316751, term316751.getClass(), "ext13", -570219781);
        setIntField(term316751, term316751.getClass(), "ext14", 2021656767);
        setIntField(term316751, term316751.getClass(), "ext15", 625759166);
        setIntField(term316751, term316751.getClass(), "ext16", 631550019);
        setIntField(term316751, term316751.getClass(), "ext17", 358498146);
        setIntField(term316751, term316751.getClass(), "ext18", -150027991);
        setIntField(term316751, term316751.getClass(), "ext19", -1153939331);
        setIntField(term316751, term316751.getClass(), "ext20", 1809509825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt14", argTypes, term316751, args);
    }

};


