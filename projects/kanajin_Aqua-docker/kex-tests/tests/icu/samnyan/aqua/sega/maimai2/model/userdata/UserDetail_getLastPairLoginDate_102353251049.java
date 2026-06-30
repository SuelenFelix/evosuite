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

public class UserDetail_getLastPairLoginDate_102353251049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222811;

    public UserDetail_getLastPairLoginDate_102353251049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term222815 = new Long(-7273680182770718108L);
        Integer term222878 = new Integer(1555746325);
        Integer term222880 = new Integer(-1910031809);
        Integer term222882 = new Integer(1270786654);
        Integer term222884 = new Integer(-1971037654);
        Integer term222886 = new Integer(-1001929512);
        Integer term222888 = new Integer(1783875922);
        Integer term222890 = new Integer(-1504060723);
        ArrayList term222876 = new ArrayList();
        ((ArrayList) term222876).add(term222878);
        ((ArrayList) term222876).add(term222880);
        ((ArrayList) term222876).add(term222882);
        ((ArrayList) term222876).add(term222884);
        ((ArrayList) term222876).add(term222886);
        ((ArrayList) term222876).add(term222888);
        ((ArrayList) term222876).add(term222890);
        Integer term222896 = new Integer(1458290326);
        Integer term222898 = new Integer(1025606001);
        Integer term222900 = new Integer(-1227561158);
        Integer term222902 = new Integer(-1853440273);
        Integer term222904 = new Integer(1884281846);
        Integer term222906 = new Integer(-1779176468);
        Integer term222908 = new Integer(-790563662);
        ArrayList term222894 = new ArrayList();
        ((ArrayList) term222894).add(term222896);
        ((ArrayList) term222894).add(term222898);
        ((ArrayList) term222894).add(term222900);
        ((ArrayList) term222894).add(term222902);
        ((ArrayList) term222894).add(term222904);
        ((ArrayList) term222894).add(term222906);
        ((ArrayList) term222894).add(term222908);
        term222811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term222813 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term222829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term222839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222844 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term222811, term222811.getClass(), "id", -4833561595834608141L);
        setLongField(term222813, term222813.getClass(), "id", 8655300051981404212L);
        setField(term222813, term222813.getClass(), "extId", term222815);
        setField(term222813, term222813.getClass(), "luid", "NSFdaqmySa");
        setIntField(term222830, term222830.getClass(), "year", 2026);
        setShortField(term222830, term222830.getClass(), "month", (short) 6);
        setShortField(term222830, term222830.getClass(), "day", (short) 4);
        setField(term222829, term222829.getClass(), "date", term222830);
        setByteField(term222834, term222834.getClass(), "hour", (byte) 14);
        setByteField(term222834, term222834.getClass(), "minute", (byte) 13);
        setByteField(term222834, term222834.getClass(), "second", (byte) 32);
        setIntField(term222834, term222834.getClass(), "nano", 911119428);
        setField(term222829, term222829.getClass(), "time", term222834);
        setField(term222813, term222813.getClass(), "registerTime", term222829);
        setIntField(term222840, term222840.getClass(), "year", 2010);
        setShortField(term222840, term222840.getClass(), "month", (short) 3);
        setShortField(term222840, term222840.getClass(), "day", (short) 18);
        setField(term222839, term222839.getClass(), "date", term222840);
        setByteField(term222844, term222844.getClass(), "hour", (byte) 5);
        setByteField(term222844, term222844.getClass(), "minute", (byte) 31);
        setByteField(term222844, term222844.getClass(), "second", (byte) 55);
        setIntField(term222844, term222844.getClass(), "nano", 783578310);
        setField(term222839, term222839.getClass(), "time", term222844);
        setField(term222813, term222813.getClass(), "accessTime", term222839);
        setField(term222811, term222811.getClass(), "card", term222813);
        setField(term222811, term222811.getClass(), "userName", "PdJGtmrIOj");
        setIntField(term222811, term222811.getClass(), "isNetMember", 233163267);
        setIntField(term222811, term222811.getClass(), "iconId", 692588997);
        setIntField(term222811, term222811.getClass(), "plateId", -600023953);
        setIntField(term222811, term222811.getClass(), "titleId", -109479766);
        setIntField(term222811, term222811.getClass(), "partnerId", -509531106);
        setIntField(term222811, term222811.getClass(), "frameId", -1606779427);
        setIntField(term222811, term222811.getClass(), "selectMapId", -1122707604);
        setIntField(term222811, term222811.getClass(), "totalAwake", -172568076);
        setIntField(term222811, term222811.getClass(), "gradeRating", -794505441);
        setIntField(term222811, term222811.getClass(), "musicRating", 791807465);
        setIntField(term222811, term222811.getClass(), "playerRating", -359105);
        setIntField(term222811, term222811.getClass(), "highestRating", 868346311);
        setIntField(term222811, term222811.getClass(), "gradeRank", 897972978);
        setIntField(term222811, term222811.getClass(), "classRank", -2099349449);
        setIntField(term222811, term222811.getClass(), "courseRank", 1719182097);
        setField(term222811, term222811.getClass(), "charaSlot", term222876);
        setField(term222811, term222811.getClass(), "charaLockSlot", term222894);
        setLongField(term222811, term222811.getClass(), "contentBit", 3841980887212256720L);
        setIntField(term222811, term222811.getClass(), "playCount", -689383574);
        setField(term222811, term222811.getClass(), "eventWatchedDate", "dmmaTphXXx");
        setField(term222811, term222811.getClass(), "lastGameId", "fNCBeKfOvy");
        setField(term222811, term222811.getClass(), "lastRomVersion", "WTcmHjCdvW");
        setField(term222811, term222811.getClass(), "lastDataVersion", "jQezHAkbKo");
        setField(term222811, term222811.getClass(), "lastLoginDate", "PoOHLUlrlB");
        setField(term222811, term222811.getClass(), "lastPlayDate", "JIJKYkewpT");
        setIntField(term222811, term222811.getClass(), "lastPlayCredit", -203297975);
        setIntField(term222811, term222811.getClass(), "lastPlayMode", -306200799);
        setIntField(term222811, term222811.getClass(), "lastPlaceId", -1669655541);
        setField(term222811, term222811.getClass(), "lastPlaceName", "MQmMOQweON");
        setIntField(term222811, term222811.getClass(), "lastAllNetId", 1688587497);
        setIntField(term222811, term222811.getClass(), "lastRegionId", -607264868);
        setField(term222811, term222811.getClass(), "lastRegionName", "fFvjphehcq");
        setField(term222811, term222811.getClass(), "lastClientId", "xFNyXUNIUf");
        setField(term222811, term222811.getClass(), "lastCountryCode", "qOCdSaiZgv");
        setIntField(term222811, term222811.getClass(), "lastSelectEMoney", -1460647226);
        setIntField(term222811, term222811.getClass(), "lastSelectTicket", 862264056);
        setIntField(term222811, term222811.getClass(), "lastSelectCourse", 1933933027);
        setIntField(term222811, term222811.getClass(), "lastCountCourse", 1995024241);
        setField(term222811, term222811.getClass(), "firstGameId", "aYDukMljDg");
        setField(term222811, term222811.getClass(), "firstRomVersion", "FhZHqaiZxO");
        setField(term222811, term222811.getClass(), "firstDataVersion", "AiuQIWurxO");
        setField(term222811, term222811.getClass(), "firstPlayDate", "bLsoJewtqm");
        setField(term222811, term222811.getClass(), "compatibleCmVersion", "AUOhzkFQog");
        setField(term222811, term222811.getClass(), "dailyBonusDate", "JayjYZjmHz");
        setField(term222811, term222811.getClass(), "dailyCourseBonusDate", "CTGiHjxmxA");
        setField(term222811, term222811.getClass(), "lastPairLoginDate", "vxLeBdauRS");
        setField(term222811, term222811.getClass(), "lastTrialPlayDate", "KCRnvwUDfK");
        setIntField(term222811, term222811.getClass(), "playVsCount", 364896764);
        setIntField(term222811, term222811.getClass(), "playSyncCount", -509113815);
        setIntField(term222811, term222811.getClass(), "winCount", -1978644575);
        setIntField(term222811, term222811.getClass(), "helpCount", 1079520989);
        setIntField(term222811, term222811.getClass(), "comboCount", -495579516);
        setLongField(term222811, term222811.getClass(), "totalDeluxscore", -2082189178019847660L);
        setLongField(term222811, term222811.getClass(), "totalBasicDeluxscore", 3649077341095610714L);
        setLongField(term222811, term222811.getClass(), "totalAdvancedDeluxscore", -2969313522894122314L);
        setLongField(term222811, term222811.getClass(), "totalExpertDeluxscore", -1112677829107158544L);
        setLongField(term222811, term222811.getClass(), "totalMasterDeluxscore", 2837387316351102987L);
        setLongField(term222811, term222811.getClass(), "totalReMasterDeluxscore", 5017180119961157803L);
        setIntField(term222811, term222811.getClass(), "totalSync", -1364226663);
        setIntField(term222811, term222811.getClass(), "totalBasicSync", -255671701);
        setIntField(term222811, term222811.getClass(), "totalAdvancedSync", 454414154);
        setIntField(term222811, term222811.getClass(), "totalExpertSync", 1716689023);
        setIntField(term222811, term222811.getClass(), "totalMasterSync", -185240752);
        setIntField(term222811, term222811.getClass(), "totalReMasterSync", 1276298262);
        setLongField(term222811, term222811.getClass(), "totalAchievement", -2482633767902300908L);
        setLongField(term222811, term222811.getClass(), "totalBasicAchievement", -6160346455890380386L);
        setLongField(term222811, term222811.getClass(), "totalAdvancedAchievement", -7918460820957685559L);
        setLongField(term222811, term222811.getClass(), "totalExpertAchievement", 1094480475210733406L);
        setLongField(term222811, term222811.getClass(), "totalMasterAchievement", -2737365214261301444L);
        setLongField(term222811, term222811.getClass(), "totalReMasterAchievement", -6462636018792723772L);
        setLongField(term222811, term222811.getClass(), "playerOldRating", -7089581545867265794L);
        setLongField(term222811, term222811.getClass(), "playerNewRating", 7517392464104551153L);
        setIntField(term222811, term222811.getClass(), "banState", 861694073);
        setLongField(term222811, term222811.getClass(), "dateTime", -8812968989706369855L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPairLoginDate", argTypes, term222811, args);
    }

};


