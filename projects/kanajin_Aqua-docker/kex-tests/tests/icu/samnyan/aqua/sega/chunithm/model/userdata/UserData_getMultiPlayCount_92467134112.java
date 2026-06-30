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

public class UserData_getMultiPlayCount_92467134112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134493;

    public UserData_getMultiPlayCount_92467134112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134497 = new Long(-113028659747841511L);
        term134493 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term134495 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134609 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134703 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134493, term134493.getClass(), "id", 7996161227095395929L);
        setLongField(term134495, term134495.getClass(), "id", 6905932167175886818L);
        setField(term134495, term134495.getClass(), "extId", term134497);
        setField(term134495, term134495.getClass(), "luid", "gbrBAjYfeF");
        setIntField(term134512, term134512.getClass(), "year", 2010);
        setShortField(term134512, term134512.getClass(), "month", (short) 7);
        setShortField(term134512, term134512.getClass(), "day", (short) 26);
        setField(term134511, term134511.getClass(), "date", term134512);
        setByteField(term134516, term134516.getClass(), "hour", (byte) 7);
        setByteField(term134516, term134516.getClass(), "minute", (byte) 19);
        setByteField(term134516, term134516.getClass(), "second", (byte) 57);
        setIntField(term134516, term134516.getClass(), "nano", 579137908);
        setField(term134511, term134511.getClass(), "time", term134516);
        setField(term134495, term134495.getClass(), "registerTime", term134511);
        setIntField(term134522, term134522.getClass(), "year", 2029);
        setShortField(term134522, term134522.getClass(), "month", (short) 9);
        setShortField(term134522, term134522.getClass(), "day", (short) 3);
        setField(term134521, term134521.getClass(), "date", term134522);
        setByteField(term134526, term134526.getClass(), "hour", (byte) 13);
        setByteField(term134526, term134526.getClass(), "minute", (byte) 25);
        setByteField(term134526, term134526.getClass(), "second", (byte) 12);
        setIntField(term134526, term134526.getClass(), "nano", 273536435);
        setField(term134521, term134521.getClass(), "time", term134526);
        setField(term134495, term134495.getClass(), "accessTime", term134521);
        setField(term134493, term134493.getClass(), "card", term134495);
        setField(term134493, term134493.getClass(), "userName", "oQyDIyWghi");
        setIntField(term134544, term134544.getClass(), "year", 2028);
        setShortField(term134544, term134544.getClass(), "month", (short) 1);
        setShortField(term134544, term134544.getClass(), "day", (short) 22);
        setField(term134543, term134543.getClass(), "date", term134544);
        setByteField(term134548, term134548.getClass(), "hour", (byte) 18);
        setByteField(term134548, term134548.getClass(), "minute", (byte) 19);
        setByteField(term134548, term134548.getClass(), "second", (byte) 33);
        setIntField(term134548, term134548.getClass(), "nano", 811633343);
        setField(term134543, term134543.getClass(), "time", term134548);
        setField(term134493, term134493.getClass(), "lastLoginDate", term134543);
        setBooleanField(term134493, term134493.getClass(), "isWebJoin", false);
        setField(term134493, term134493.getClass(), "webLimitDate", "VGvITdbKFh");
        setIntField(term134493, term134493.getClass(), "level", -1152780010);
        setIntField(term134493, term134493.getClass(), "reincarnationNum", 1773328262);
        setField(term134493, term134493.getClass(), "exp", "OzwgkolGue");
        setLongField(term134493, term134493.getClass(), "point", 2617544460322738020L);
        setLongField(term134493, term134493.getClass(), "totalPoint", 564179403578347108L);
        setIntField(term134493, term134493.getClass(), "playCount", 1076156036);
        setIntField(term134493, term134493.getClass(), "multiPlayCount", 497222104);
        setIntField(term134493, term134493.getClass(), "multiWinCount", -422135580);
        setIntField(term134493, term134493.getClass(), "requestResCount", -1726471303);
        setIntField(term134493, term134493.getClass(), "acceptResCount", 1563484306);
        setIntField(term134493, term134493.getClass(), "successResCount", -1064532569);
        setIntField(term134493, term134493.getClass(), "playerRating", 1894908411);
        setIntField(term134493, term134493.getClass(), "highestRating", 1128957140);
        setIntField(term134493, term134493.getClass(), "nameplateId", 1975880274);
        setIntField(term134493, term134493.getClass(), "frameId", 1216213747);
        setIntField(term134493, term134493.getClass(), "characterId", -428741760);
        setIntField(term134493, term134493.getClass(), "trophyId", 570973373);
        setIntField(term134493, term134493.getClass(), "playedTutorialBit", -1116126684);
        setIntField(term134493, term134493.getClass(), "firstTutorialCancelNum", 713171221);
        setIntField(term134493, term134493.getClass(), "masterTutorialCancelNum", -922412655);
        setIntField(term134493, term134493.getClass(), "totalRepertoireCount", 422773242);
        setIntField(term134493, term134493.getClass(), "totalMapNum", 1756235049);
        setLongField(term134493, term134493.getClass(), "totalHiScore", -6293767832755310218L);
        setLongField(term134493, term134493.getClass(), "totalBasicHighScore", -2050848614286348518L);
        setLongField(term134493, term134493.getClass(), "totalAdvancedHighScore", -8891931985436128241L);
        setLongField(term134493, term134493.getClass(), "totalExpertHighScore", -6033375404212182966L);
        setLongField(term134493, term134493.getClass(), "totalMasterHighScore", 90919700177074161L);
        setIntField(term134605, term134605.getClass(), "year", 2013);
        setShortField(term134605, term134605.getClass(), "month", (short) 4);
        setShortField(term134605, term134605.getClass(), "day", (short) 8);
        setField(term134604, term134604.getClass(), "date", term134605);
        setByteField(term134609, term134609.getClass(), "hour", (byte) 11);
        setByteField(term134609, term134609.getClass(), "minute", (byte) 55);
        setByteField(term134609, term134609.getClass(), "second", (byte) 47);
        setIntField(term134609, term134609.getClass(), "nano", 633671681);
        setField(term134604, term134604.getClass(), "time", term134609);
        setField(term134493, term134493.getClass(), "eventWatchedDate", term134604);
        setIntField(term134493, term134493.getClass(), "friendCount", 1252714657);
        setBooleanField(term134493, term134493.getClass(), "isMaimai", false);
        setField(term134493, term134493.getClass(), "firstGameId", "wqwrSGuByQ");
        setField(term134493, term134493.getClass(), "firstRomVersion", "KJOrIBIJCp");
        setField(term134493, term134493.getClass(), "firstDataVersion", "LHDRljWYoi");
        setIntField(term134653, term134653.getClass(), "year", 2026);
        setShortField(term134653, term134653.getClass(), "month", (short) 1);
        setShortField(term134653, term134653.getClass(), "day", (short) 17);
        setField(term134652, term134652.getClass(), "date", term134653);
        setByteField(term134657, term134657.getClass(), "hour", (byte) 9);
        setByteField(term134657, term134657.getClass(), "minute", (byte) 22);
        setByteField(term134657, term134657.getClass(), "second", (byte) 10);
        setIntField(term134657, term134657.getClass(), "nano", 411650029);
        setField(term134652, term134652.getClass(), "time", term134657);
        setField(term134493, term134493.getClass(), "firstPlayDate", term134652);
        setField(term134493, term134493.getClass(), "lastGameId", "buQOGnBPlD");
        setField(term134493, term134493.getClass(), "lastRomVersion", "ofiucEZNjp");
        setField(term134493, term134493.getClass(), "lastDataVersion", "kbQZxTtvgH");
        setIntField(term134699, term134699.getClass(), "year", 2017);
        setShortField(term134699, term134699.getClass(), "month", (short) 8);
        setShortField(term134699, term134699.getClass(), "day", (short) 8);
        setField(term134698, term134698.getClass(), "date", term134699);
        setByteField(term134703, term134703.getClass(), "hour", (byte) 7);
        setByteField(term134703, term134703.getClass(), "minute", (byte) 31);
        setByteField(term134703, term134703.getClass(), "second", (byte) 6);
        setIntField(term134703, term134703.getClass(), "nano", 442316602);
        setField(term134698, term134698.getClass(), "time", term134703);
        setField(term134493, term134493.getClass(), "lastPlayDate", term134698);
        setIntField(term134493, term134493.getClass(), "lastPlaceId", 279120793);
        setField(term134493, term134493.getClass(), "lastPlaceName", "aYWilzmMDP");
        setField(term134493, term134493.getClass(), "lastRegionId", "AaQIoxTkkz");
        setField(term134493, term134493.getClass(), "lastRegionName", "utuhuXZwKw");
        setField(term134493, term134493.getClass(), "lastAllNetId", "HDmUBvnTDS");
        setField(term134493, term134493.getClass(), "lastClientId", "JySfuJQGCc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiPlayCount", argTypes, term134493, args);
    }

};


