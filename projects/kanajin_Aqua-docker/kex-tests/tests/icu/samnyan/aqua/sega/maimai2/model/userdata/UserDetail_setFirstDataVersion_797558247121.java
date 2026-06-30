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

public class UserDetail_setFirstDataVersion_797558247121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263885;

    public UserDetail_setFirstDataVersion_797558247121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term263889 = new Long(5818741986224130131L);
        Integer term263952 = new Integer(782600956);
        ArrayList term263950 = new ArrayList();
        ((ArrayList) term263950).add(term263952);
        Integer term263958 = new Integer(-1051453067);
        Integer term263960 = new Integer(-865849681);
        Integer term263962 = new Integer(-1554795442);
        Integer term263964 = new Integer(1486110844);
        ArrayList term263956 = new ArrayList();
        ((ArrayList) term263956).add(term263958);
        ((ArrayList) term263956).add(term263960);
        ((ArrayList) term263956).add(term263962);
        ((ArrayList) term263956).add(term263964);
        term263885 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term263887 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term263903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263908 = newInstance(Class.forName("java.time.LocalTime"));
        Object term263913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263918 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term263885, term263885.getClass(), "id", -5764825363059854519L);
        setLongField(term263887, term263887.getClass(), "id", 4389648769515944219L);
        setField(term263887, term263887.getClass(), "extId", term263889);
        setField(term263887, term263887.getClass(), "luid", "yooiSdRAOb");
        setIntField(term263904, term263904.getClass(), "year", 2014);
        setShortField(term263904, term263904.getClass(), "month", (short) 7);
        setShortField(term263904, term263904.getClass(), "day", (short) 8);
        setField(term263903, term263903.getClass(), "date", term263904);
        setByteField(term263908, term263908.getClass(), "hour", (byte) 15);
        setByteField(term263908, term263908.getClass(), "minute", (byte) 58);
        setByteField(term263908, term263908.getClass(), "second", (byte) 59);
        setIntField(term263908, term263908.getClass(), "nano", 92869125);
        setField(term263903, term263903.getClass(), "time", term263908);
        setField(term263887, term263887.getClass(), "registerTime", term263903);
        setIntField(term263914, term263914.getClass(), "year", 2015);
        setShortField(term263914, term263914.getClass(), "month", (short) 3);
        setShortField(term263914, term263914.getClass(), "day", (short) 10);
        setField(term263913, term263913.getClass(), "date", term263914);
        setByteField(term263918, term263918.getClass(), "hour", (byte) 2);
        setByteField(term263918, term263918.getClass(), "minute", (byte) 20);
        setByteField(term263918, term263918.getClass(), "second", (byte) 3);
        setIntField(term263918, term263918.getClass(), "nano", 298112800);
        setField(term263913, term263913.getClass(), "time", term263918);
        setField(term263887, term263887.getClass(), "accessTime", term263913);
        setField(term263885, term263885.getClass(), "card", term263887);
        setField(term263885, term263885.getClass(), "userName", "SoTgnoBFiD");
        setIntField(term263885, term263885.getClass(), "isNetMember", 601872271);
        setIntField(term263885, term263885.getClass(), "iconId", -450820124);
        setIntField(term263885, term263885.getClass(), "plateId", 27602265);
        setIntField(term263885, term263885.getClass(), "titleId", 1499859121);
        setIntField(term263885, term263885.getClass(), "partnerId", 1450681315);
        setIntField(term263885, term263885.getClass(), "frameId", -1789757325);
        setIntField(term263885, term263885.getClass(), "selectMapId", 1038376802);
        setIntField(term263885, term263885.getClass(), "totalAwake", -200470581);
        setIntField(term263885, term263885.getClass(), "gradeRating", 495681073);
        setIntField(term263885, term263885.getClass(), "musicRating", 114045633);
        setIntField(term263885, term263885.getClass(), "playerRating", 1507770571);
        setIntField(term263885, term263885.getClass(), "highestRating", -593285402);
        setIntField(term263885, term263885.getClass(), "gradeRank", 1095762061);
        setIntField(term263885, term263885.getClass(), "classRank", 1310320674);
        setIntField(term263885, term263885.getClass(), "courseRank", -45101595);
        setField(term263885, term263885.getClass(), "charaSlot", term263950);
        setField(term263885, term263885.getClass(), "charaLockSlot", term263956);
        setLongField(term263885, term263885.getClass(), "contentBit", -2321009935917245630L);
        setIntField(term263885, term263885.getClass(), "playCount", -1249978853);
        setField(term263885, term263885.getClass(), "eventWatchedDate", "xkhqTWXZqZ");
        setField(term263885, term263885.getClass(), "lastGameId", "ABldombRYF");
        setField(term263885, term263885.getClass(), "lastRomVersion", "LJiniBXnjB");
        setField(term263885, term263885.getClass(), "lastDataVersion", "ySvbXaxFVk");
        setField(term263885, term263885.getClass(), "lastLoginDate", "IkBWbcZtiH");
        setField(term263885, term263885.getClass(), "lastPlayDate", "mItcHoacSH");
        setIntField(term263885, term263885.getClass(), "lastPlayCredit", 773182873);
        setIntField(term263885, term263885.getClass(), "lastPlayMode", 1412041317);
        setIntField(term263885, term263885.getClass(), "lastPlaceId", 651388483);
        setField(term263885, term263885.getClass(), "lastPlaceName", "fzMkBxNUHB");
        setIntField(term263885, term263885.getClass(), "lastAllNetId", 223631307);
        setIntField(term263885, term263885.getClass(), "lastRegionId", -812717507);
        setField(term263885, term263885.getClass(), "lastRegionName", "qzVIBCSTKC");
        setField(term263885, term263885.getClass(), "lastClientId", "ITnfwxpCsl");
        setField(term263885, term263885.getClass(), "lastCountryCode", "KZCgNQgPRl");
        setIntField(term263885, term263885.getClass(), "lastSelectEMoney", 1197190525);
        setIntField(term263885, term263885.getClass(), "lastSelectTicket", 45627277);
        setIntField(term263885, term263885.getClass(), "lastSelectCourse", 909630692);
        setIntField(term263885, term263885.getClass(), "lastCountCourse", 80250518);
        setField(term263885, term263885.getClass(), "firstGameId", "cRXtToSuNf");
        setField(term263885, term263885.getClass(), "firstRomVersion", "EGhoDGUsdp");
        setField(term263885, term263885.getClass(), "firstDataVersion", "bpCsiZxavU");
        setField(term263885, term263885.getClass(), "firstPlayDate", "GkQIPePZVq");
        setField(term263885, term263885.getClass(), "compatibleCmVersion", "sNCvwCZLFy");
        setField(term263885, term263885.getClass(), "dailyBonusDate", "ntVwFBVYrW");
        setField(term263885, term263885.getClass(), "dailyCourseBonusDate", "HlALosrXEr");
        setField(term263885, term263885.getClass(), "lastPairLoginDate", "qOjvdcWKrI");
        setField(term263885, term263885.getClass(), "lastTrialPlayDate", "XBGzXdRVOP");
        setIntField(term263885, term263885.getClass(), "playVsCount", 1213620067);
        setIntField(term263885, term263885.getClass(), "playSyncCount", 755859860);
        setIntField(term263885, term263885.getClass(), "winCount", -569124511);
        setIntField(term263885, term263885.getClass(), "helpCount", -654736850);
        setIntField(term263885, term263885.getClass(), "comboCount", 346888763);
        setLongField(term263885, term263885.getClass(), "totalDeluxscore", -7609566233052990144L);
        setLongField(term263885, term263885.getClass(), "totalBasicDeluxscore", -8665390661827618925L);
        setLongField(term263885, term263885.getClass(), "totalAdvancedDeluxscore", -5806890044814813203L);
        setLongField(term263885, term263885.getClass(), "totalExpertDeluxscore", -2107474875496152191L);
        setLongField(term263885, term263885.getClass(), "totalMasterDeluxscore", -5979961425871342520L);
        setLongField(term263885, term263885.getClass(), "totalReMasterDeluxscore", 6823453856646641765L);
        setIntField(term263885, term263885.getClass(), "totalSync", 801146791);
        setIntField(term263885, term263885.getClass(), "totalBasicSync", -2039233257);
        setIntField(term263885, term263885.getClass(), "totalAdvancedSync", -209516690);
        setIntField(term263885, term263885.getClass(), "totalExpertSync", 767276213);
        setIntField(term263885, term263885.getClass(), "totalMasterSync", 1443840804);
        setIntField(term263885, term263885.getClass(), "totalReMasterSync", -1858397011);
        setLongField(term263885, term263885.getClass(), "totalAchievement", -7088239825471884521L);
        setLongField(term263885, term263885.getClass(), "totalBasicAchievement", 4653372146907066579L);
        setLongField(term263885, term263885.getClass(), "totalAdvancedAchievement", 5892627717952349316L);
        setLongField(term263885, term263885.getClass(), "totalExpertAchievement", -7424760549919278594L);
        setLongField(term263885, term263885.getClass(), "totalMasterAchievement", 8418608510860732964L);
        setLongField(term263885, term263885.getClass(), "totalReMasterAchievement", 8981346699993519963L);
        setLongField(term263885, term263885.getClass(), "playerOldRating", -4626047971614032587L);
        setLongField(term263885, term263885.getClass(), "playerNewRating", 2514305138167069827L);
        setIntField(term263885, term263885.getClass(), "banState", -730490288);
        setLongField(term263885, term263885.getClass(), "dateTime", 6047377293137319207L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vdgGisWgKr";
        callMethod(klass, "setFirstDataVersion", argTypes, term263885, args);
    }

};


