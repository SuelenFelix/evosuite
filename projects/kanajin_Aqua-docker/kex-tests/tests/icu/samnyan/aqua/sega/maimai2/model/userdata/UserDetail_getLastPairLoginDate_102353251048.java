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

public class UserDetail_getLastPairLoginDate_102353251048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222756;

    public UserDetail_getLastPairLoginDate_102353251048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term222760 = new Long(-7273680182770718108L);
        Integer term222823 = new Integer(1555746325);
        Integer term222825 = new Integer(-1910031809);
        Integer term222827 = new Integer(1270786654);
        Integer term222829 = new Integer(-1971037654);
        Integer term222831 = new Integer(-1001929512);
        Integer term222833 = new Integer(1783875922);
        Integer term222835 = new Integer(-1504060723);
        ArrayList term222821 = new ArrayList();
        ((ArrayList) term222821).add(term222823);
        ((ArrayList) term222821).add(term222825);
        ((ArrayList) term222821).add(term222827);
        ((ArrayList) term222821).add(term222829);
        ((ArrayList) term222821).add(term222831);
        ((ArrayList) term222821).add(term222833);
        ((ArrayList) term222821).add(term222835);
        Integer term222841 = new Integer(1458290326);
        Integer term222843 = new Integer(1025606001);
        Integer term222845 = new Integer(-1227561158);
        Integer term222847 = new Integer(-1853440273);
        Integer term222849 = new Integer(1884281846);
        Integer term222851 = new Integer(-1779176468);
        Integer term222853 = new Integer(-790563662);
        ArrayList term222839 = new ArrayList();
        ((ArrayList) term222839).add(term222841);
        ((ArrayList) term222839).add(term222843);
        ((ArrayList) term222839).add(term222845);
        ((ArrayList) term222839).add(term222847);
        ((ArrayList) term222839).add(term222849);
        ((ArrayList) term222839).add(term222851);
        ((ArrayList) term222839).add(term222853);
        term222756 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term222758 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term222774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term222784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222789 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term222756, term222756.getClass(), "id", -4833561595834608141L);
        setLongField(term222758, term222758.getClass(), "id", 8655300051981404212L);
        setField(term222758, term222758.getClass(), "extId", term222760);
        setField(term222758, term222758.getClass(), "luid", "NSFdaqmySa");
        setIntField(term222775, term222775.getClass(), "year", 2026);
        setShortField(term222775, term222775.getClass(), "month", (short) 6);
        setShortField(term222775, term222775.getClass(), "day", (short) 4);
        setField(term222774, term222774.getClass(), "date", term222775);
        setByteField(term222779, term222779.getClass(), "hour", (byte) 14);
        setByteField(term222779, term222779.getClass(), "minute", (byte) 13);
        setByteField(term222779, term222779.getClass(), "second", (byte) 32);
        setIntField(term222779, term222779.getClass(), "nano", 911119428);
        setField(term222774, term222774.getClass(), "time", term222779);
        setField(term222758, term222758.getClass(), "registerTime", term222774);
        setIntField(term222785, term222785.getClass(), "year", 2010);
        setShortField(term222785, term222785.getClass(), "month", (short) 3);
        setShortField(term222785, term222785.getClass(), "day", (short) 18);
        setField(term222784, term222784.getClass(), "date", term222785);
        setByteField(term222789, term222789.getClass(), "hour", (byte) 5);
        setByteField(term222789, term222789.getClass(), "minute", (byte) 31);
        setByteField(term222789, term222789.getClass(), "second", (byte) 55);
        setIntField(term222789, term222789.getClass(), "nano", 783578310);
        setField(term222784, term222784.getClass(), "time", term222789);
        setField(term222758, term222758.getClass(), "accessTime", term222784);
        setField(term222756, term222756.getClass(), "card", term222758);
        setField(term222756, term222756.getClass(), "userName", "PdJGtmrIOj");
        setIntField(term222756, term222756.getClass(), "isNetMember", 233163267);
        setIntField(term222756, term222756.getClass(), "iconId", 692588997);
        setIntField(term222756, term222756.getClass(), "plateId", -600023953);
        setIntField(term222756, term222756.getClass(), "titleId", -109479766);
        setIntField(term222756, term222756.getClass(), "partnerId", -509531106);
        setIntField(term222756, term222756.getClass(), "frameId", -1606779427);
        setIntField(term222756, term222756.getClass(), "selectMapId", -1122707604);
        setIntField(term222756, term222756.getClass(), "totalAwake", -172568076);
        setIntField(term222756, term222756.getClass(), "gradeRating", -794505441);
        setIntField(term222756, term222756.getClass(), "musicRating", 791807465);
        setIntField(term222756, term222756.getClass(), "playerRating", -359105);
        setIntField(term222756, term222756.getClass(), "highestRating", 868346311);
        setIntField(term222756, term222756.getClass(), "gradeRank", 897972978);
        setIntField(term222756, term222756.getClass(), "classRank", -2099349449);
        setIntField(term222756, term222756.getClass(), "courseRank", 1719182097);
        setField(term222756, term222756.getClass(), "charaSlot", term222821);
        setField(term222756, term222756.getClass(), "charaLockSlot", term222839);
        setLongField(term222756, term222756.getClass(), "contentBit", 3841980887212256720L);
        setIntField(term222756, term222756.getClass(), "playCount", -689383574);
        setField(term222756, term222756.getClass(), "eventWatchedDate", "dmmaTphXXx");
        setField(term222756, term222756.getClass(), "lastGameId", "fNCBeKfOvy");
        setField(term222756, term222756.getClass(), "lastRomVersion", "WTcmHjCdvW");
        setField(term222756, term222756.getClass(), "lastDataVersion", "jQezHAkbKo");
        setField(term222756, term222756.getClass(), "lastLoginDate", "PoOHLUlrlB");
        setField(term222756, term222756.getClass(), "lastPlayDate", "JIJKYkewpT");
        setIntField(term222756, term222756.getClass(), "lastPlayCredit", -203297975);
        setIntField(term222756, term222756.getClass(), "lastPlayMode", -306200799);
        setIntField(term222756, term222756.getClass(), "lastPlaceId", -1669655541);
        setField(term222756, term222756.getClass(), "lastPlaceName", "MQmMOQweON");
        setIntField(term222756, term222756.getClass(), "lastAllNetId", 1688587497);
        setIntField(term222756, term222756.getClass(), "lastRegionId", -607264868);
        setField(term222756, term222756.getClass(), "lastRegionName", "fFvjphehcq");
        setField(term222756, term222756.getClass(), "lastClientId", "xFNyXUNIUf");
        setField(term222756, term222756.getClass(), "lastCountryCode", "qOCdSaiZgv");
        setIntField(term222756, term222756.getClass(), "lastSelectEMoney", -1460647226);
        setIntField(term222756, term222756.getClass(), "lastSelectTicket", 862264056);
        setIntField(term222756, term222756.getClass(), "lastSelectCourse", 1933933027);
        setIntField(term222756, term222756.getClass(), "lastCountCourse", 1995024241);
        setField(term222756, term222756.getClass(), "firstGameId", "aYDukMljDg");
        setField(term222756, term222756.getClass(), "firstRomVersion", "FhZHqaiZxO");
        setField(term222756, term222756.getClass(), "firstDataVersion", "AiuQIWurxO");
        setField(term222756, term222756.getClass(), "firstPlayDate", "bLsoJewtqm");
        setField(term222756, term222756.getClass(), "compatibleCmVersion", "AUOhzkFQog");
        setField(term222756, term222756.getClass(), "dailyBonusDate", "JayjYZjmHz");
        setField(term222756, term222756.getClass(), "dailyCourseBonusDate", "CTGiHjxmxA");
        setField(term222756, term222756.getClass(), "lastPairLoginDate", "vxLeBdauRS");
        setField(term222756, term222756.getClass(), "lastTrialPlayDate", "KCRnvwUDfK");
        setIntField(term222756, term222756.getClass(), "playVsCount", 364896764);
        setIntField(term222756, term222756.getClass(), "playSyncCount", -509113815);
        setIntField(term222756, term222756.getClass(), "winCount", -1978644575);
        setIntField(term222756, term222756.getClass(), "helpCount", 1079520989);
        setIntField(term222756, term222756.getClass(), "comboCount", -495579516);
        setLongField(term222756, term222756.getClass(), "totalDeluxscore", -2082189178019847660L);
        setLongField(term222756, term222756.getClass(), "totalBasicDeluxscore", 3649077341095610714L);
        setLongField(term222756, term222756.getClass(), "totalAdvancedDeluxscore", -2969313522894122314L);
        setLongField(term222756, term222756.getClass(), "totalExpertDeluxscore", -1112677829107158544L);
        setLongField(term222756, term222756.getClass(), "totalMasterDeluxscore", 2837387316351102987L);
        setLongField(term222756, term222756.getClass(), "totalReMasterDeluxscore", 5017180119961157803L);
        setIntField(term222756, term222756.getClass(), "totalSync", -1364226663);
        setIntField(term222756, term222756.getClass(), "totalBasicSync", -255671701);
        setIntField(term222756, term222756.getClass(), "totalAdvancedSync", 454414154);
        setIntField(term222756, term222756.getClass(), "totalExpertSync", 1716689023);
        setIntField(term222756, term222756.getClass(), "totalMasterSync", -185240752);
        setIntField(term222756, term222756.getClass(), "totalReMasterSync", 1276298262);
        setLongField(term222756, term222756.getClass(), "totalAchievement", -2482633767902300908L);
        setLongField(term222756, term222756.getClass(), "totalBasicAchievement", -6160346455890380386L);
        setLongField(term222756, term222756.getClass(), "totalAdvancedAchievement", -7918460820957685559L);
        setLongField(term222756, term222756.getClass(), "totalExpertAchievement", 1094480475210733406L);
        setLongField(term222756, term222756.getClass(), "totalMasterAchievement", -2737365214261301444L);
        setLongField(term222756, term222756.getClass(), "totalReMasterAchievement", -6462636018792723772L);
        setLongField(term222756, term222756.getClass(), "playerOldRating", -7089581545867265794L);
        setLongField(term222756, term222756.getClass(), "playerNewRating", 7517392464104551153L);
        setIntField(term222756, term222756.getClass(), "banState", 861694073);
        setLongField(term222756, term222756.getClass(), "dateTime", -8812968989706369855L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPairLoginDate", argTypes, term222756, args);
    }

};


