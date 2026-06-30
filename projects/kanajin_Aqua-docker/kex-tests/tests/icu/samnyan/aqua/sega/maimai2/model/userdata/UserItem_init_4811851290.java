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

public class UserItem_init_4811851290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32917;

    public UserItem_init_4811851290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32921 = new Long(-4443169559037975007L);
        Integer term32984 = new Integer(510162332);
        ArrayList term32982 = new ArrayList();
        ((ArrayList) term32982).add(term32984);
        Integer term32990 = new Integer(888506903);
        Integer term32992 = new Integer(200252898);
        Integer term32994 = new Integer(-1831826725);
        Integer term32996 = new Integer(752152965);
        Integer term32998 = new Integer(-1577069773);
        Integer term33000 = new Integer(-266625190);
        Integer term33002 = new Integer(489201218);
        Integer term33004 = new Integer(464181937);
        ArrayList term32988 = new ArrayList();
        ((ArrayList) term32988).add(term32990);
        ((ArrayList) term32988).add(term32992);
        ((ArrayList) term32988).add(term32994);
        ((ArrayList) term32988).add(term32996);
        ((ArrayList) term32988).add(term32998);
        ((ArrayList) term32988).add(term33000);
        ((ArrayList) term32988).add(term33002);
        ((ArrayList) term32988).add(term33004);
        term32917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term32919 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32950 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32917, term32917.getClass(), "id", 9041534029896652168L);
        setLongField(term32919, term32919.getClass(), "id", 1342629750107593698L);
        setField(term32919, term32919.getClass(), "extId", term32921);
        setField(term32919, term32919.getClass(), "luid", "PrHWfHydsG");
        setIntField(term32936, term32936.getClass(), "year", 2016);
        setShortField(term32936, term32936.getClass(), "month", (short) 6);
        setShortField(term32936, term32936.getClass(), "day", (short) 23);
        setField(term32935, term32935.getClass(), "date", term32936);
        setByteField(term32940, term32940.getClass(), "hour", (byte) 20);
        setByteField(term32940, term32940.getClass(), "minute", (byte) 51);
        setByteField(term32940, term32940.getClass(), "second", (byte) 43);
        setIntField(term32940, term32940.getClass(), "nano", 284389409);
        setField(term32935, term32935.getClass(), "time", term32940);
        setField(term32919, term32919.getClass(), "registerTime", term32935);
        setIntField(term32946, term32946.getClass(), "year", 2014);
        setShortField(term32946, term32946.getClass(), "month", (short) 10);
        setShortField(term32946, term32946.getClass(), "day", (short) 7);
        setField(term32945, term32945.getClass(), "date", term32946);
        setByteField(term32950, term32950.getClass(), "hour", (byte) 12);
        setByteField(term32950, term32950.getClass(), "minute", (byte) 59);
        setByteField(term32950, term32950.getClass(), "second", (byte) 39);
        setIntField(term32950, term32950.getClass(), "nano", 603709306);
        setField(term32945, term32945.getClass(), "time", term32950);
        setField(term32919, term32919.getClass(), "accessTime", term32945);
        setField(term32917, term32917.getClass(), "card", term32919);
        setField(term32917, term32917.getClass(), "userName", "igruEzTbBE");
        setIntField(term32917, term32917.getClass(), "isNetMember", 1080834214);
        setIntField(term32917, term32917.getClass(), "iconId", 323842695);
        setIntField(term32917, term32917.getClass(), "plateId", 331897564);
        setIntField(term32917, term32917.getClass(), "titleId", -968105925);
        setIntField(term32917, term32917.getClass(), "partnerId", -206020926);
        setIntField(term32917, term32917.getClass(), "frameId", -2054014210);
        setIntField(term32917, term32917.getClass(), "selectMapId", 1179045520);
        setIntField(term32917, term32917.getClass(), "totalAwake", 1056739921);
        setIntField(term32917, term32917.getClass(), "gradeRating", 1384627927);
        setIntField(term32917, term32917.getClass(), "musicRating", -1252280115);
        setIntField(term32917, term32917.getClass(), "playerRating", -120849363);
        setIntField(term32917, term32917.getClass(), "highestRating", 147387583);
        setIntField(term32917, term32917.getClass(), "gradeRank", -1307347557);
        setIntField(term32917, term32917.getClass(), "classRank", 1092325030);
        setIntField(term32917, term32917.getClass(), "courseRank", -1901115940);
        setField(term32917, term32917.getClass(), "charaSlot", term32982);
        setField(term32917, term32917.getClass(), "charaLockSlot", term32988);
        setLongField(term32917, term32917.getClass(), "contentBit", -2050224942342343039L);
        setIntField(term32917, term32917.getClass(), "playCount", 1934437115);
        setField(term32917, term32917.getClass(), "eventWatchedDate", "LFjgROsRUV");
        setField(term32917, term32917.getClass(), "lastGameId", "kHxujKiCsr");
        setField(term32917, term32917.getClass(), "lastRomVersion", "cseZveWowm");
        setField(term32917, term32917.getClass(), "lastDataVersion", "idfslIPhgx");
        setField(term32917, term32917.getClass(), "lastLoginDate", "HyFLOXeoDX");
        setField(term32917, term32917.getClass(), "lastPlayDate", "crkNabVaWs");
        setIntField(term32917, term32917.getClass(), "lastPlayCredit", 1820319919);
        setIntField(term32917, term32917.getClass(), "lastPlayMode", 1444962020);
        setIntField(term32917, term32917.getClass(), "lastPlaceId", 1636228804);
        setField(term32917, term32917.getClass(), "lastPlaceName", "qBcAJgrABE");
        setIntField(term32917, term32917.getClass(), "lastAllNetId", -1650533427);
        setIntField(term32917, term32917.getClass(), "lastRegionId", -1076430316);
        setField(term32917, term32917.getClass(), "lastRegionName", "JKdZuLFRwC");
        setField(term32917, term32917.getClass(), "lastClientId", "hfhLLoWnRU");
        setField(term32917, term32917.getClass(), "lastCountryCode", "RpofnOPYha");
        setIntField(term32917, term32917.getClass(), "lastSelectEMoney", 1984492528);
        setIntField(term32917, term32917.getClass(), "lastSelectTicket", -655764067);
        setIntField(term32917, term32917.getClass(), "lastSelectCourse", 31238744);
        setIntField(term32917, term32917.getClass(), "lastCountCourse", 680031965);
        setField(term32917, term32917.getClass(), "firstGameId", "CQYmAsjvPU");
        setField(term32917, term32917.getClass(), "firstRomVersion", "NNkIIFpxiB");
        setField(term32917, term32917.getClass(), "firstDataVersion", "sBmtvFPDso");
        setField(term32917, term32917.getClass(), "firstPlayDate", "qsUIxrLolr");
        setField(term32917, term32917.getClass(), "compatibleCmVersion", "IlQxArYcgB");
        setField(term32917, term32917.getClass(), "dailyBonusDate", "lIgKCvCuoH");
        setField(term32917, term32917.getClass(), "dailyCourseBonusDate", "dHuWgRwLOm");
        setField(term32917, term32917.getClass(), "lastPairLoginDate", "PsTQDxNIld");
        setField(term32917, term32917.getClass(), "lastTrialPlayDate", "uoBijJjvaj");
        setIntField(term32917, term32917.getClass(), "playVsCount", -2112419098);
        setIntField(term32917, term32917.getClass(), "playSyncCount", -1649429373);
        setIntField(term32917, term32917.getClass(), "winCount", -1605518502);
        setIntField(term32917, term32917.getClass(), "helpCount", -499081946);
        setIntField(term32917, term32917.getClass(), "comboCount", 1834067063);
        setLongField(term32917, term32917.getClass(), "totalDeluxscore", -2456427474561523240L);
        setLongField(term32917, term32917.getClass(), "totalBasicDeluxscore", -7010338441819086776L);
        setLongField(term32917, term32917.getClass(), "totalAdvancedDeluxscore", 1881020230556705937L);
        setLongField(term32917, term32917.getClass(), "totalExpertDeluxscore", -2937192447508714837L);
        setLongField(term32917, term32917.getClass(), "totalMasterDeluxscore", 3804352102719959988L);
        setLongField(term32917, term32917.getClass(), "totalReMasterDeluxscore", -5317408542996378156L);
        setIntField(term32917, term32917.getClass(), "totalSync", -1578513908);
        setIntField(term32917, term32917.getClass(), "totalBasicSync", 312330930);
        setIntField(term32917, term32917.getClass(), "totalAdvancedSync", 1635910980);
        setIntField(term32917, term32917.getClass(), "totalExpertSync", 1560346640);
        setIntField(term32917, term32917.getClass(), "totalMasterSync", 100626332);
        setIntField(term32917, term32917.getClass(), "totalReMasterSync", 763794722);
        setLongField(term32917, term32917.getClass(), "totalAchievement", 3345606904545902400L);
        setLongField(term32917, term32917.getClass(), "totalBasicAchievement", -6289397283685653555L);
        setLongField(term32917, term32917.getClass(), "totalAdvancedAchievement", 4270489998641176236L);
        setLongField(term32917, term32917.getClass(), "totalExpertAchievement", 7649159120514186821L);
        setLongField(term32917, term32917.getClass(), "totalMasterAchievement", 9219442829218784847L);
        setLongField(term32917, term32917.getClass(), "totalReMasterAchievement", 5153056225441125523L);
        setLongField(term32917, term32917.getClass(), "playerOldRating", 8082286259336326914L);
        setLongField(term32917, term32917.getClass(), "playerNewRating", 1093716108786896379L);
        setIntField(term32917, term32917.getClass(), "banState", -696403395);
        setLongField(term32917, term32917.getClass(), "dateTime", 3917904228139004931L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term32917;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


