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

public class UserDetail_getPlaySyncCount_38522929451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224457;

    public UserDetail_getPlaySyncCount_38522929451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224461 = new Long(9174730812791817537L);
        Integer term224524 = new Integer(2030509680);
        Integer term224526 = new Integer(-927217294);
        Integer term224528 = new Integer(-157082836);
        ArrayList term224522 = new ArrayList();
        ((ArrayList) term224522).add(term224524);
        ((ArrayList) term224522).add(term224526);
        ((ArrayList) term224522).add(term224528);
        ArrayList term224532 = new ArrayList();
        term224457 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term224459 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term224475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term224485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224490 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term224457, term224457.getClass(), "id", 1802223650726139040L);
        setLongField(term224459, term224459.getClass(), "id", 5650647751145506885L);
        setField(term224459, term224459.getClass(), "extId", term224461);
        setField(term224459, term224459.getClass(), "luid", "DjtLoBcwMe");
        setIntField(term224476, term224476.getClass(), "year", 2019);
        setShortField(term224476, term224476.getClass(), "month", (short) 3);
        setShortField(term224476, term224476.getClass(), "day", (short) 14);
        setField(term224475, term224475.getClass(), "date", term224476);
        setByteField(term224480, term224480.getClass(), "hour", (byte) 21);
        setByteField(term224480, term224480.getClass(), "minute", (byte) 1);
        setByteField(term224480, term224480.getClass(), "second", (byte) 27);
        setIntField(term224480, term224480.getClass(), "nano", 855781320);
        setField(term224475, term224475.getClass(), "time", term224480);
        setField(term224459, term224459.getClass(), "registerTime", term224475);
        setIntField(term224486, term224486.getClass(), "year", 2010);
        setShortField(term224486, term224486.getClass(), "month", (short) 2);
        setShortField(term224486, term224486.getClass(), "day", (short) 1);
        setField(term224485, term224485.getClass(), "date", term224486);
        setByteField(term224490, term224490.getClass(), "hour", (byte) 15);
        setByteField(term224490, term224490.getClass(), "minute", (byte) 12);
        setByteField(term224490, term224490.getClass(), "second", (byte) 8);
        setIntField(term224490, term224490.getClass(), "nano", 722621943);
        setField(term224485, term224485.getClass(), "time", term224490);
        setField(term224459, term224459.getClass(), "accessTime", term224485);
        setField(term224457, term224457.getClass(), "card", term224459);
        setField(term224457, term224457.getClass(), "userName", "meUVYWhBFo");
        setIntField(term224457, term224457.getClass(), "isNetMember", 1135106965);
        setIntField(term224457, term224457.getClass(), "iconId", 1832192277);
        setIntField(term224457, term224457.getClass(), "plateId", 1254864568);
        setIntField(term224457, term224457.getClass(), "titleId", -571619755);
        setIntField(term224457, term224457.getClass(), "partnerId", 451376857);
        setIntField(term224457, term224457.getClass(), "frameId", -1991834397);
        setIntField(term224457, term224457.getClass(), "selectMapId", -1181437252);
        setIntField(term224457, term224457.getClass(), "totalAwake", 1473244237);
        setIntField(term224457, term224457.getClass(), "gradeRating", 1217408539);
        setIntField(term224457, term224457.getClass(), "musicRating", -80988884);
        setIntField(term224457, term224457.getClass(), "playerRating", 1775341759);
        setIntField(term224457, term224457.getClass(), "highestRating", -1260716399);
        setIntField(term224457, term224457.getClass(), "gradeRank", 2009351154);
        setIntField(term224457, term224457.getClass(), "classRank", -1078550468);
        setIntField(term224457, term224457.getClass(), "courseRank", -1867741312);
        setField(term224457, term224457.getClass(), "charaSlot", term224522);
        setField(term224457, term224457.getClass(), "charaLockSlot", term224532);
        setLongField(term224457, term224457.getClass(), "contentBit", 8348501915993953384L);
        setIntField(term224457, term224457.getClass(), "playCount", -795605694);
        setField(term224457, term224457.getClass(), "eventWatchedDate", "JjmysiVNEh");
        setField(term224457, term224457.getClass(), "lastGameId", "xsRfZCAubi");
        setField(term224457, term224457.getClass(), "lastRomVersion", "vRtHDpAuWX");
        setField(term224457, term224457.getClass(), "lastDataVersion", "KzggKElOWW");
        setField(term224457, term224457.getClass(), "lastLoginDate", "rOJFLnnriK");
        setField(term224457, term224457.getClass(), "lastPlayDate", "uxPZLhUnKh");
        setIntField(term224457, term224457.getClass(), "lastPlayCredit", -1791286061);
        setIntField(term224457, term224457.getClass(), "lastPlayMode", -326801646);
        setIntField(term224457, term224457.getClass(), "lastPlaceId", 1716329981);
        setField(term224457, term224457.getClass(), "lastPlaceName", "BuOyamVtMR");
        setIntField(term224457, term224457.getClass(), "lastAllNetId", 1984104176);
        setIntField(term224457, term224457.getClass(), "lastRegionId", 1030528931);
        setField(term224457, term224457.getClass(), "lastRegionName", "xWMVBrrOyw");
        setField(term224457, term224457.getClass(), "lastClientId", "SLOZSlbZhc");
        setField(term224457, term224457.getClass(), "lastCountryCode", "EqpGeKZRCt");
        setIntField(term224457, term224457.getClass(), "lastSelectEMoney", 2054837350);
        setIntField(term224457, term224457.getClass(), "lastSelectTicket", 1209247785);
        setIntField(term224457, term224457.getClass(), "lastSelectCourse", 1950406971);
        setIntField(term224457, term224457.getClass(), "lastCountCourse", 1834357646);
        setField(term224457, term224457.getClass(), "firstGameId", "ZPbOWzPADZ");
        setField(term224457, term224457.getClass(), "firstRomVersion", "oBknhKKIFK");
        setField(term224457, term224457.getClass(), "firstDataVersion", "tfUFeoWiTr");
        setField(term224457, term224457.getClass(), "firstPlayDate", "hMVaHWQXZO");
        setField(term224457, term224457.getClass(), "compatibleCmVersion", "njWnMTRwPZ");
        setField(term224457, term224457.getClass(), "dailyBonusDate", "XZfXhKtihX");
        setField(term224457, term224457.getClass(), "dailyCourseBonusDate", "mmHuLwDpkf");
        setField(term224457, term224457.getClass(), "lastPairLoginDate", "GjyMraKalr");
        setField(term224457, term224457.getClass(), "lastTrialPlayDate", "wZnhIfXRJr");
        setIntField(term224457, term224457.getClass(), "playVsCount", -934619156);
        setIntField(term224457, term224457.getClass(), "playSyncCount", 751000283);
        setIntField(term224457, term224457.getClass(), "winCount", -591472707);
        setIntField(term224457, term224457.getClass(), "helpCount", -670816490);
        setIntField(term224457, term224457.getClass(), "comboCount", -552668710);
        setLongField(term224457, term224457.getClass(), "totalDeluxscore", -3744776131666873745L);
        setLongField(term224457, term224457.getClass(), "totalBasicDeluxscore", 5916711676141065738L);
        setLongField(term224457, term224457.getClass(), "totalAdvancedDeluxscore", 1122241556844575286L);
        setLongField(term224457, term224457.getClass(), "totalExpertDeluxscore", -4081932476065206064L);
        setLongField(term224457, term224457.getClass(), "totalMasterDeluxscore", 4804861320458212945L);
        setLongField(term224457, term224457.getClass(), "totalReMasterDeluxscore", -8909583119182461015L);
        setIntField(term224457, term224457.getClass(), "totalSync", -760927478);
        setIntField(term224457, term224457.getClass(), "totalBasicSync", -619141849);
        setIntField(term224457, term224457.getClass(), "totalAdvancedSync", 1930976366);
        setIntField(term224457, term224457.getClass(), "totalExpertSync", -539700568);
        setIntField(term224457, term224457.getClass(), "totalMasterSync", 1235020855);
        setIntField(term224457, term224457.getClass(), "totalReMasterSync", 589191849);
        setLongField(term224457, term224457.getClass(), "totalAchievement", 8112908390673739352L);
        setLongField(term224457, term224457.getClass(), "totalBasicAchievement", 8506387940383586093L);
        setLongField(term224457, term224457.getClass(), "totalAdvancedAchievement", -3396931832744828318L);
        setLongField(term224457, term224457.getClass(), "totalExpertAchievement", 58949307114037214L);
        setLongField(term224457, term224457.getClass(), "totalMasterAchievement", 7467886048752150766L);
        setLongField(term224457, term224457.getClass(), "totalReMasterAchievement", -6980310935600459599L);
        setLongField(term224457, term224457.getClass(), "playerOldRating", 5718709907715139334L);
        setLongField(term224457, term224457.getClass(), "playerNewRating", 7874544298926560716L);
        setIntField(term224457, term224457.getClass(), "banState", -400353527);
        setLongField(term224457, term224457.getClass(), "dateTime", 4889444909547333281L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaySyncCount", argTypes, term224457, args);
    }

};


