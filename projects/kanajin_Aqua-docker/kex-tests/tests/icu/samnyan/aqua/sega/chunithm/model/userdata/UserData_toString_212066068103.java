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

public class UserData_toString_212066068103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173717;

    public UserData_toString_212066068103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term173721 = new Long(-6001151456088965547L);
        term173717 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term173719 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term173735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173740 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173927 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term173717, term173717.getClass(), "id", 8435578074607494266L);
        setLongField(term173719, term173719.getClass(), "id", 1158999985649712324L);
        setField(term173719, term173719.getClass(), "extId", term173721);
        setField(term173719, term173719.getClass(), "luid", "gMaZghyhSE");
        setIntField(term173736, term173736.getClass(), "year", 2028);
        setShortField(term173736, term173736.getClass(), "month", (short) 5);
        setShortField(term173736, term173736.getClass(), "day", (short) 28);
        setField(term173735, term173735.getClass(), "date", term173736);
        setByteField(term173740, term173740.getClass(), "hour", (byte) 20);
        setByteField(term173740, term173740.getClass(), "minute", (byte) 56);
        setByteField(term173740, term173740.getClass(), "second", (byte) 53);
        setIntField(term173740, term173740.getClass(), "nano", 413209875);
        setField(term173735, term173735.getClass(), "time", term173740);
        setField(term173719, term173719.getClass(), "registerTime", term173735);
        setIntField(term173746, term173746.getClass(), "year", 2019);
        setShortField(term173746, term173746.getClass(), "month", (short) 1);
        setShortField(term173746, term173746.getClass(), "day", (short) 21);
        setField(term173745, term173745.getClass(), "date", term173746);
        setByteField(term173750, term173750.getClass(), "hour", (byte) 14);
        setByteField(term173750, term173750.getClass(), "minute", (byte) 50);
        setByteField(term173750, term173750.getClass(), "second", (byte) 57);
        setIntField(term173750, term173750.getClass(), "nano", 932575121);
        setField(term173745, term173745.getClass(), "time", term173750);
        setField(term173719, term173719.getClass(), "accessTime", term173745);
        setField(term173717, term173717.getClass(), "card", term173719);
        setField(term173717, term173717.getClass(), "userName", "KFemAGjeNe");
        setIntField(term173768, term173768.getClass(), "year", 2012);
        setShortField(term173768, term173768.getClass(), "month", (short) 8);
        setShortField(term173768, term173768.getClass(), "day", (short) 26);
        setField(term173767, term173767.getClass(), "date", term173768);
        setByteField(term173772, term173772.getClass(), "hour", (byte) 3);
        setByteField(term173772, term173772.getClass(), "minute", (byte) 14);
        setByteField(term173772, term173772.getClass(), "second", (byte) 58);
        setIntField(term173772, term173772.getClass(), "nano", 633926522);
        setField(term173767, term173767.getClass(), "time", term173772);
        setField(term173717, term173717.getClass(), "lastLoginDate", term173767);
        setBooleanField(term173717, term173717.getClass(), "isWebJoin", false);
        setField(term173717, term173717.getClass(), "webLimitDate", "PcFPYKeVcH");
        setIntField(term173717, term173717.getClass(), "level", 2040131935);
        setIntField(term173717, term173717.getClass(), "reincarnationNum", -1183833390);
        setField(term173717, term173717.getClass(), "exp", "osxxxUzOYV");
        setLongField(term173717, term173717.getClass(), "point", 1240831512723722148L);
        setLongField(term173717, term173717.getClass(), "totalPoint", -5427519956812562732L);
        setIntField(term173717, term173717.getClass(), "playCount", -479335978);
        setIntField(term173717, term173717.getClass(), "multiPlayCount", 1628406480);
        setIntField(term173717, term173717.getClass(), "multiWinCount", -282271093);
        setIntField(term173717, term173717.getClass(), "requestResCount", -1014876011);
        setIntField(term173717, term173717.getClass(), "acceptResCount", -1030632367);
        setIntField(term173717, term173717.getClass(), "successResCount", -566251622);
        setIntField(term173717, term173717.getClass(), "playerRating", -2094377383);
        setIntField(term173717, term173717.getClass(), "highestRating", 955822338);
        setIntField(term173717, term173717.getClass(), "nameplateId", -1756659503);
        setIntField(term173717, term173717.getClass(), "frameId", 1965003991);
        setIntField(term173717, term173717.getClass(), "characterId", -1725442005);
        setIntField(term173717, term173717.getClass(), "trophyId", 2026681061);
        setIntField(term173717, term173717.getClass(), "playedTutorialBit", -1893031586);
        setIntField(term173717, term173717.getClass(), "firstTutorialCancelNum", -1605006859);
        setIntField(term173717, term173717.getClass(), "masterTutorialCancelNum", -555520867);
        setIntField(term173717, term173717.getClass(), "totalRepertoireCount", -55584715);
        setIntField(term173717, term173717.getClass(), "totalMapNum", -1140026535);
        setLongField(term173717, term173717.getClass(), "totalHiScore", 6139192874538815024L);
        setLongField(term173717, term173717.getClass(), "totalBasicHighScore", 2328251836921519486L);
        setLongField(term173717, term173717.getClass(), "totalAdvancedHighScore", 5343471362225022865L);
        setLongField(term173717, term173717.getClass(), "totalExpertHighScore", 5497156593559186662L);
        setLongField(term173717, term173717.getClass(), "totalMasterHighScore", 6687061627800420404L);
        setIntField(term173829, term173829.getClass(), "year", 2028);
        setShortField(term173829, term173829.getClass(), "month", (short) 6);
        setShortField(term173829, term173829.getClass(), "day", (short) 15);
        setField(term173828, term173828.getClass(), "date", term173829);
        setByteField(term173833, term173833.getClass(), "hour", (byte) 7);
        setByteField(term173833, term173833.getClass(), "minute", (byte) 23);
        setByteField(term173833, term173833.getClass(), "second", (byte) 0);
        setIntField(term173833, term173833.getClass(), "nano", 526784486);
        setField(term173828, term173828.getClass(), "time", term173833);
        setField(term173717, term173717.getClass(), "eventWatchedDate", term173828);
        setIntField(term173717, term173717.getClass(), "friendCount", 1380376071);
        setBooleanField(term173717, term173717.getClass(), "isMaimai", true);
        setField(term173717, term173717.getClass(), "firstGameId", "TKgvONjuwo");
        setField(term173717, term173717.getClass(), "firstRomVersion", "EfHbKLrlba");
        setField(term173717, term173717.getClass(), "firstDataVersion", "kTKInMVwKn");
        setIntField(term173877, term173877.getClass(), "year", 2025);
        setShortField(term173877, term173877.getClass(), "month", (short) 7);
        setShortField(term173877, term173877.getClass(), "day", (short) 10);
        setField(term173876, term173876.getClass(), "date", term173877);
        setByteField(term173881, term173881.getClass(), "hour", (byte) 17);
        setByteField(term173881, term173881.getClass(), "minute", (byte) 49);
        setByteField(term173881, term173881.getClass(), "second", (byte) 39);
        setIntField(term173881, term173881.getClass(), "nano", 695498434);
        setField(term173876, term173876.getClass(), "time", term173881);
        setField(term173717, term173717.getClass(), "firstPlayDate", term173876);
        setField(term173717, term173717.getClass(), "lastGameId", "WyXXpLPnjE");
        setField(term173717, term173717.getClass(), "lastRomVersion", "EZqcFiCmkN");
        setField(term173717, term173717.getClass(), "lastDataVersion", "InPNCZSdaO");
        setIntField(term173923, term173923.getClass(), "year", 2027);
        setShortField(term173923, term173923.getClass(), "month", (short) 8);
        setShortField(term173923, term173923.getClass(), "day", (short) 28);
        setField(term173922, term173922.getClass(), "date", term173923);
        setByteField(term173927, term173927.getClass(), "hour", (byte) 9);
        setByteField(term173927, term173927.getClass(), "minute", (byte) 28);
        setByteField(term173927, term173927.getClass(), "second", (byte) 25);
        setIntField(term173927, term173927.getClass(), "nano", 670717440);
        setField(term173922, term173922.getClass(), "time", term173927);
        setField(term173717, term173717.getClass(), "lastPlayDate", term173922);
        setIntField(term173717, term173717.getClass(), "lastPlaceId", 1236068241);
        setField(term173717, term173717.getClass(), "lastPlaceName", "wqoFYDQVFC");
        setField(term173717, term173717.getClass(), "lastRegionId", "FVPbcnRWsS");
        setField(term173717, term173717.getClass(), "lastRegionName", "sWSwYJRLWw");
        setField(term173717, term173717.getClass(), "lastAllNetId", "hNqPjlwmpW");
        setField(term173717, term173717.getClass(), "lastClientId", "LvPdtNhyPi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term173717, args);
    }

};


