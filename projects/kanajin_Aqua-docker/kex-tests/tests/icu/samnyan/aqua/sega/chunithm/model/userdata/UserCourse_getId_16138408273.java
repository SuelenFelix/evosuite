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

public class UserCourse_getId_16138408273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1914904;

    public UserCourse_getId_16138408273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1914910 = new Long(-8920882081423821401L);
        term1914904 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1914906 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1914908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1914924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1914925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1914929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1914934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1914935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1914939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1914956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1914957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1914961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915196 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1914904, term1914904.getClass(), "id", 3757028848536019969L);
        setLongField(term1914906, term1914906.getClass(), "id", -6130854993229639392L);
        setLongField(term1914908, term1914908.getClass(), "id", -5847051301024125691L);
        setField(term1914908, term1914908.getClass(), "extId", term1914910);
        setField(term1914908, term1914908.getClass(), "luid", "pSHSGccIWs");
        setIntField(term1914925, term1914925.getClass(), "year", 2014);
        setShortField(term1914925, term1914925.getClass(), "month", (short) 12);
        setShortField(term1914925, term1914925.getClass(), "day", (short) 14);
        setField(term1914924, term1914924.getClass(), "date", term1914925);
        setByteField(term1914929, term1914929.getClass(), "hour", (byte) 8);
        setByteField(term1914929, term1914929.getClass(), "minute", (byte) 21);
        setByteField(term1914929, term1914929.getClass(), "second", (byte) 13);
        setIntField(term1914929, term1914929.getClass(), "nano", 281267981);
        setField(term1914924, term1914924.getClass(), "time", term1914929);
        setField(term1914908, term1914908.getClass(), "registerTime", term1914924);
        setIntField(term1914935, term1914935.getClass(), "year", 2011);
        setShortField(term1914935, term1914935.getClass(), "month", (short) 4);
        setShortField(term1914935, term1914935.getClass(), "day", (short) 16);
        setField(term1914934, term1914934.getClass(), "date", term1914935);
        setByteField(term1914939, term1914939.getClass(), "hour", (byte) 17);
        setByteField(term1914939, term1914939.getClass(), "minute", (byte) 23);
        setByteField(term1914939, term1914939.getClass(), "second", (byte) 40);
        setIntField(term1914939, term1914939.getClass(), "nano", 715039920);
        setField(term1914934, term1914934.getClass(), "time", term1914939);
        setField(term1914908, term1914908.getClass(), "accessTime", term1914934);
        setField(term1914906, term1914906.getClass(), "card", term1914908);
        setField(term1914906, term1914906.getClass(), "userName", "vNuqscjzrk");
        setIntField(term1914957, term1914957.getClass(), "year", 2028);
        setShortField(term1914957, term1914957.getClass(), "month", (short) 1);
        setShortField(term1914957, term1914957.getClass(), "day", (short) 29);
        setField(term1914956, term1914956.getClass(), "date", term1914957);
        setByteField(term1914961, term1914961.getClass(), "hour", (byte) 18);
        setByteField(term1914961, term1914961.getClass(), "minute", (byte) 48);
        setByteField(term1914961, term1914961.getClass(), "second", (byte) 45);
        setIntField(term1914961, term1914961.getClass(), "nano", 747590119);
        setField(term1914956, term1914956.getClass(), "time", term1914961);
        setField(term1914906, term1914906.getClass(), "lastLoginDate", term1914956);
        setBooleanField(term1914906, term1914906.getClass(), "isWebJoin", false);
        setField(term1914906, term1914906.getClass(), "webLimitDate", "gjGoaVsWEo");
        setIntField(term1914906, term1914906.getClass(), "level", -420472278);
        setIntField(term1914906, term1914906.getClass(), "reincarnationNum", -1250236766);
        setField(term1914906, term1914906.getClass(), "exp", "FcUIZfSiFP");
        setLongField(term1914906, term1914906.getClass(), "point", -131849513114315842L);
        setLongField(term1914906, term1914906.getClass(), "totalPoint", 3459518055479020566L);
        setIntField(term1914906, term1914906.getClass(), "playCount", 1759050364);
        setIntField(term1914906, term1914906.getClass(), "multiPlayCount", -1434554185);
        setIntField(term1914906, term1914906.getClass(), "multiWinCount", -1468224708);
        setIntField(term1914906, term1914906.getClass(), "requestResCount", 2142432048);
        setIntField(term1914906, term1914906.getClass(), "acceptResCount", 543210136);
        setIntField(term1914906, term1914906.getClass(), "successResCount", -1339177600);
        setIntField(term1914906, term1914906.getClass(), "playerRating", 693320548);
        setIntField(term1914906, term1914906.getClass(), "highestRating", 154298303);
        setIntField(term1914906, term1914906.getClass(), "nameplateId", 126915861);
        setIntField(term1914906, term1914906.getClass(), "frameId", 179904358);
        setIntField(term1914906, term1914906.getClass(), "characterId", 486652680);
        setIntField(term1914906, term1914906.getClass(), "trophyId", -2056152031);
        setIntField(term1914906, term1914906.getClass(), "playedTutorialBit", 1441110717);
        setIntField(term1914906, term1914906.getClass(), "firstTutorialCancelNum", 267671360);
        setIntField(term1914906, term1914906.getClass(), "masterTutorialCancelNum", -906396446);
        setIntField(term1914906, term1914906.getClass(), "totalRepertoireCount", -230926457);
        setIntField(term1914906, term1914906.getClass(), "totalMapNum", -2138080406);
        setLongField(term1914906, term1914906.getClass(), "totalHiScore", 7660008353855731098L);
        setLongField(term1914906, term1914906.getClass(), "totalBasicHighScore", 7000915428589961319L);
        setLongField(term1914906, term1914906.getClass(), "totalAdvancedHighScore", -6083105970554622183L);
        setLongField(term1914906, term1914906.getClass(), "totalExpertHighScore", -1912546744605958768L);
        setLongField(term1914906, term1914906.getClass(), "totalMasterHighScore", 5557975275714177901L);
        setIntField(term1915018, term1915018.getClass(), "year", 2014);
        setShortField(term1915018, term1915018.getClass(), "month", (short) 7);
        setShortField(term1915018, term1915018.getClass(), "day", (short) 16);
        setField(term1915017, term1915017.getClass(), "date", term1915018);
        setByteField(term1915022, term1915022.getClass(), "hour", (byte) 21);
        setByteField(term1915022, term1915022.getClass(), "minute", (byte) 14);
        setByteField(term1915022, term1915022.getClass(), "second", (byte) 33);
        setIntField(term1915022, term1915022.getClass(), "nano", 725770722);
        setField(term1915017, term1915017.getClass(), "time", term1915022);
        setField(term1914906, term1914906.getClass(), "eventWatchedDate", term1915017);
        setIntField(term1914906, term1914906.getClass(), "friendCount", 306891893);
        setBooleanField(term1914906, term1914906.getClass(), "isMaimai", true);
        setField(term1914906, term1914906.getClass(), "firstGameId", "dhoxYkrsgy");
        setField(term1914906, term1914906.getClass(), "firstRomVersion", "dNPlWiocHu");
        setField(term1914906, term1914906.getClass(), "firstDataVersion", "PAVjDxviJi");
        setIntField(term1915066, term1915066.getClass(), "year", 2028);
        setShortField(term1915066, term1915066.getClass(), "month", (short) 9);
        setShortField(term1915066, term1915066.getClass(), "day", (short) 2);
        setField(term1915065, term1915065.getClass(), "date", term1915066);
        setByteField(term1915070, term1915070.getClass(), "hour", (byte) 11);
        setByteField(term1915070, term1915070.getClass(), "minute", (byte) 58);
        setByteField(term1915070, term1915070.getClass(), "second", (byte) 46);
        setIntField(term1915070, term1915070.getClass(), "nano", 833466487);
        setField(term1915065, term1915065.getClass(), "time", term1915070);
        setField(term1914906, term1914906.getClass(), "firstPlayDate", term1915065);
        setField(term1914906, term1914906.getClass(), "lastGameId", "MEcGWHWLCL");
        setField(term1914906, term1914906.getClass(), "lastRomVersion", "CJIfKFenpE");
        setField(term1914906, term1914906.getClass(), "lastDataVersion", "tvXfcQSAVT");
        setIntField(term1915112, term1915112.getClass(), "year", 2023);
        setShortField(term1915112, term1915112.getClass(), "month", (short) 9);
        setShortField(term1915112, term1915112.getClass(), "day", (short) 19);
        setField(term1915111, term1915111.getClass(), "date", term1915112);
        setByteField(term1915116, term1915116.getClass(), "hour", (byte) 22);
        setByteField(term1915116, term1915116.getClass(), "minute", (byte) 46);
        setByteField(term1915116, term1915116.getClass(), "second", (byte) 42);
        setIntField(term1915116, term1915116.getClass(), "nano", 446327321);
        setField(term1915111, term1915111.getClass(), "time", term1915116);
        setField(term1914906, term1914906.getClass(), "lastPlayDate", term1915111);
        setIntField(term1914906, term1914906.getClass(), "lastPlaceId", 1769840388);
        setField(term1914906, term1914906.getClass(), "lastPlaceName", "aCmgjzlMCD");
        setField(term1914906, term1914906.getClass(), "lastRegionId", "NquJxAuCmd");
        setField(term1914906, term1914906.getClass(), "lastRegionName", "RiJtxrrNwW");
        setField(term1914906, term1914906.getClass(), "lastAllNetId", "XqtBuZsbJD");
        setField(term1914906, term1914906.getClass(), "lastClientId", "OeyrgGEJln");
        setField(term1914904, term1914904.getClass(), "user", term1914906);
        setIntField(term1914904, term1914904.getClass(), "courseId", 1782466357);
        setIntField(term1914904, term1914904.getClass(), "classId", 349421736);
        setIntField(term1914904, term1914904.getClass(), "playCount", -891374381);
        setIntField(term1914904, term1914904.getClass(), "scoreMax", -400523236);
        setBooleanField(term1914904, term1914904.getClass(), "isFullCombo", false);
        setBooleanField(term1914904, term1914904.getClass(), "isAllJustice", false);
        setBooleanField(term1914904, term1914904.getClass(), "isSuccess", false);
        setIntField(term1914904, term1914904.getClass(), "scoreRank", -461833099);
        setIntField(term1914904, term1914904.getClass(), "eventId", 1536659097);
        setIntField(term1915192, term1915192.getClass(), "year", 2013);
        setShortField(term1915192, term1915192.getClass(), "month", (short) 11);
        setShortField(term1915192, term1915192.getClass(), "day", (short) 1);
        setField(term1915191, term1915191.getClass(), "date", term1915192);
        setByteField(term1915196, term1915196.getClass(), "hour", (byte) 7);
        setByteField(term1915196, term1915196.getClass(), "minute", (byte) 42);
        setByteField(term1915196, term1915196.getClass(), "second", (byte) 53);
        setIntField(term1915196, term1915196.getClass(), "nano", 844023571);
        setField(term1915191, term1915191.getClass(), "time", term1915196);
        setField(term1914904, term1914904.getClass(), "lastPlayDate", term1915191);
        setIntField(term1914904, term1914904.getClass(), "param1", 1219302814);
        setIntField(term1914904, term1914904.getClass(), "param2", 5031161);
        setIntField(term1914904, term1914904.getClass(), "param3", 692051405);
        setIntField(term1914904, term1914904.getClass(), "param4", 2001342233);
        setBooleanField(term1914904, term1914904.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1914904, args);
    }

};


