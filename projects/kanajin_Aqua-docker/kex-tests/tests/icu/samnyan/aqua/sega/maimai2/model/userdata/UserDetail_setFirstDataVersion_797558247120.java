package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setFirstDataVersion_797558247120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263830;

    public UserDetail_setFirstDataVersion_797558247120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term263834 = new Long(5818741986224130131L);
        Integer term263897 = new Integer(782600956);
        ArrayList term263895 = new ArrayList();
        ((ArrayList) term263895).add(term263897);
        Integer term263903 = new Integer(-1051453067);
        Integer term263905 = new Integer(-865849681);
        Integer term263907 = new Integer(-1554795442);
        Integer term263909 = new Integer(1486110844);
        ArrayList term263901 = new ArrayList();
        ((ArrayList) term263901).add(term263903);
        ((ArrayList) term263901).add(term263905);
        ((ArrayList) term263901).add(term263907);
        ((ArrayList) term263901).add(term263909);
        term263830 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term263832 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term263848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term263858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term263830, term263830.getClass(), "id", -5764825363059854519L);
        setLongField(term263832, term263832.getClass(), "id", 4389648769515944219L);
        setField(term263832, term263832.getClass(), "extId", term263834);
        setField(term263832, term263832.getClass(), "luid", "yooiSdRAOb");
        setIntField(term263849, term263849.getClass(), "year", 2014);
        setShortField(term263849, term263849.getClass(), "month", (short) 7);
        setShortField(term263849, term263849.getClass(), "day", (short) 8);
        setField(term263848, term263848.getClass(), "date", term263849);
        setByteField(term263853, term263853.getClass(), "hour", (byte) 15);
        setByteField(term263853, term263853.getClass(), "minute", (byte) 58);
        setByteField(term263853, term263853.getClass(), "second", (byte) 59);
        setIntField(term263853, term263853.getClass(), "nano", 92869125);
        setField(term263848, term263848.getClass(), "time", term263853);
        setField(term263832, term263832.getClass(), "registerTime", term263848);
        setIntField(term263859, term263859.getClass(), "year", 2015);
        setShortField(term263859, term263859.getClass(), "month", (short) 3);
        setShortField(term263859, term263859.getClass(), "day", (short) 10);
        setField(term263858, term263858.getClass(), "date", term263859);
        setByteField(term263863, term263863.getClass(), "hour", (byte) 2);
        setByteField(term263863, term263863.getClass(), "minute", (byte) 20);
        setByteField(term263863, term263863.getClass(), "second", (byte) 3);
        setIntField(term263863, term263863.getClass(), "nano", 298112800);
        setField(term263858, term263858.getClass(), "time", term263863);
        setField(term263832, term263832.getClass(), "accessTime", term263858);
        setField(term263830, term263830.getClass(), "card", term263832);
        setField(term263830, term263830.getClass(), "userName", "SoTgnoBFiD");
        setIntField(term263830, term263830.getClass(), "isNetMember", 601872271);
        setIntField(term263830, term263830.getClass(), "iconId", -450820124);
        setIntField(term263830, term263830.getClass(), "plateId", 27602265);
        setIntField(term263830, term263830.getClass(), "titleId", 1499859121);
        setIntField(term263830, term263830.getClass(), "partnerId", 1450681315);
        setIntField(term263830, term263830.getClass(), "frameId", -1789757325);
        setIntField(term263830, term263830.getClass(), "selectMapId", 1038376802);
        setIntField(term263830, term263830.getClass(), "totalAwake", -200470581);
        setIntField(term263830, term263830.getClass(), "gradeRating", 495681073);
        setIntField(term263830, term263830.getClass(), "musicRating", 114045633);
        setIntField(term263830, term263830.getClass(), "playerRating", 1507770571);
        setIntField(term263830, term263830.getClass(), "highestRating", -593285402);
        setIntField(term263830, term263830.getClass(), "gradeRank", 1095762061);
        setIntField(term263830, term263830.getClass(), "classRank", 1310320674);
        setIntField(term263830, term263830.getClass(), "courseRank", -45101595);
        setField(term263830, term263830.getClass(), "charaSlot", term263895);
        setField(term263830, term263830.getClass(), "charaLockSlot", term263901);
        setLongField(term263830, term263830.getClass(), "contentBit", -2321009935917245630L);
        setIntField(term263830, term263830.getClass(), "playCount", -1249978853);
        setField(term263830, term263830.getClass(), "eventWatchedDate", "xkhqTWXZqZ");
        setField(term263830, term263830.getClass(), "lastGameId", "ABldombRYF");
        setField(term263830, term263830.getClass(), "lastRomVersion", "LJiniBXnjB");
        setField(term263830, term263830.getClass(), "lastDataVersion", "ySvbXaxFVk");
        setField(term263830, term263830.getClass(), "lastLoginDate", "IkBWbcZtiH");
        setField(term263830, term263830.getClass(), "lastPlayDate", "mItcHoacSH");
        setIntField(term263830, term263830.getClass(), "lastPlayCredit", 773182873);
        setIntField(term263830, term263830.getClass(), "lastPlayMode", 1412041317);
        setIntField(term263830, term263830.getClass(), "lastPlaceId", 651388483);
        setField(term263830, term263830.getClass(), "lastPlaceName", "fzMkBxNUHB");
        setIntField(term263830, term263830.getClass(), "lastAllNetId", 223631307);
        setIntField(term263830, term263830.getClass(), "lastRegionId", -812717507);
        setField(term263830, term263830.getClass(), "lastRegionName", "qzVIBCSTKC");
        setField(term263830, term263830.getClass(), "lastClientId", "ITnfwxpCsl");
        setField(term263830, term263830.getClass(), "lastCountryCode", "KZCgNQgPRl");
        setIntField(term263830, term263830.getClass(), "lastSelectEMoney", 1197190525);
        setIntField(term263830, term263830.getClass(), "lastSelectTicket", 45627277);
        setIntField(term263830, term263830.getClass(), "lastSelectCourse", 909630692);
        setIntField(term263830, term263830.getClass(), "lastCountCourse", 80250518);
        setField(term263830, term263830.getClass(), "firstGameId", "cRXtToSuNf");
        setField(term263830, term263830.getClass(), "firstRomVersion", "EGhoDGUsdp");
        setField(term263830, term263830.getClass(), "firstDataVersion", "bpCsiZxavU");
        setField(term263830, term263830.getClass(), "firstPlayDate", "GkQIPePZVq");
        setField(term263830, term263830.getClass(), "compatibleCmVersion", "sNCvwCZLFy");
        setField(term263830, term263830.getClass(), "dailyBonusDate", "ntVwFBVYrW");
        setField(term263830, term263830.getClass(), "dailyCourseBonusDate", "HlALosrXEr");
        setField(term263830, term263830.getClass(), "lastPairLoginDate", "qOjvdcWKrI");
        setField(term263830, term263830.getClass(), "lastTrialPlayDate", "XBGzXdRVOP");
        setIntField(term263830, term263830.getClass(), "playVsCount", 1213620067);
        setIntField(term263830, term263830.getClass(), "playSyncCount", 755859860);
        setIntField(term263830, term263830.getClass(), "winCount", -569124511);
        setIntField(term263830, term263830.getClass(), "helpCount", -654736850);
        setIntField(term263830, term263830.getClass(), "comboCount", 346888763);
        setLongField(term263830, term263830.getClass(), "totalDeluxscore", -7609566233052990144L);
        setLongField(term263830, term263830.getClass(), "totalBasicDeluxscore", -8665390661827618925L);
        setLongField(term263830, term263830.getClass(), "totalAdvancedDeluxscore", -5806890044814813203L);
        setLongField(term263830, term263830.getClass(), "totalExpertDeluxscore", -2107474875496152191L);
        setLongField(term263830, term263830.getClass(), "totalMasterDeluxscore", -5979961425871342520L);
        setLongField(term263830, term263830.getClass(), "totalReMasterDeluxscore", 6823453856646641765L);
        setIntField(term263830, term263830.getClass(), "totalSync", 801146791);
        setIntField(term263830, term263830.getClass(), "totalBasicSync", -2039233257);
        setIntField(term263830, term263830.getClass(), "totalAdvancedSync", -209516690);
        setIntField(term263830, term263830.getClass(), "totalExpertSync", 767276213);
        setIntField(term263830, term263830.getClass(), "totalMasterSync", 1443840804);
        setIntField(term263830, term263830.getClass(), "totalReMasterSync", -1858397011);
        setLongField(term263830, term263830.getClass(), "totalAchievement", -7088239825471884521L);
        setLongField(term263830, term263830.getClass(), "totalBasicAchievement", 4653372146907066579L);
        setLongField(term263830, term263830.getClass(), "totalAdvancedAchievement", 5892627717952349316L);
        setLongField(term263830, term263830.getClass(), "totalExpertAchievement", -7424760549919278594L);
        setLongField(term263830, term263830.getClass(), "totalMasterAchievement", 8418608510860732964L);
        setLongField(term263830, term263830.getClass(), "totalReMasterAchievement", 8981346699993519963L);
        setLongField(term263830, term263830.getClass(), "playerOldRating", -4626047971614032587L);
        setLongField(term263830, term263830.getClass(), "playerNewRating", 2514305138167069827L);
        setIntField(term263830, term263830.getClass(), "banState", -730490288);
        setLongField(term263830, term263830.getClass(), "dateTime", 6047377293137319207L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vdgGisWgKr";
        callMethod(klass, "setFirstDataVersion", argTypes, term263830, args);
    }

};


