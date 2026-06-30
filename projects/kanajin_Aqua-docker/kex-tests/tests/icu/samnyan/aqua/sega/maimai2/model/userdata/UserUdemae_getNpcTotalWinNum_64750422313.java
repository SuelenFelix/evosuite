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

public class UserUdemae_getNpcTotalWinNum_64750422313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101964;

    public UserUdemae_getNpcTotalWinNum_64750422313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101970 = new Long(-2783999800714825789L);
        Integer term102033 = new Integer(1357632911);
        Integer term102035 = new Integer(1768195761);
        Integer term102037 = new Integer(-1382661134);
        ArrayList term102031 = new ArrayList();
        ((ArrayList) term102031).add(term102033);
        ((ArrayList) term102031).add(term102035);
        ((ArrayList) term102031).add(term102037);
        Integer term102043 = new Integer(-1042022818);
        Integer term102045 = new Integer(317372051);
        Integer term102047 = new Integer(892170444);
        Integer term102049 = new Integer(-82417507);
        Integer term102051 = new Integer(-511400358);
        Integer term102053 = new Integer(-742178468);
        Integer term102055 = new Integer(694989162);
        Integer term102057 = new Integer(-65504209);
        Integer term102059 = new Integer(1745199030);
        ArrayList term102041 = new ArrayList();
        ((ArrayList) term102041).add(term102043);
        ((ArrayList) term102041).add(term102045);
        ((ArrayList) term102041).add(term102047);
        ((ArrayList) term102041).add(term102049);
        ((ArrayList) term102041).add(term102051);
        ((ArrayList) term102041).add(term102053);
        ((ArrayList) term102041).add(term102055);
        ((ArrayList) term102041).add(term102057);
        ((ArrayList) term102041).add(term102059);
        term101964 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term101966 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term101968 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101999 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101964, term101964.getClass(), "id", -2722365438824574372L);
        setLongField(term101966, term101966.getClass(), "id", -3033059928142333838L);
        setLongField(term101968, term101968.getClass(), "id", -3701403882243337652L);
        setField(term101968, term101968.getClass(), "extId", term101970);
        setField(term101968, term101968.getClass(), "luid", "pLrycUApoJ");
        setIntField(term101985, term101985.getClass(), "year", 2028);
        setShortField(term101985, term101985.getClass(), "month", (short) 6);
        setShortField(term101985, term101985.getClass(), "day", (short) 21);
        setField(term101984, term101984.getClass(), "date", term101985);
        setByteField(term101989, term101989.getClass(), "hour", (byte) 2);
        setByteField(term101989, term101989.getClass(), "minute", (byte) 38);
        setByteField(term101989, term101989.getClass(), "second", (byte) 11);
        setIntField(term101989, term101989.getClass(), "nano", 40256095);
        setField(term101984, term101984.getClass(), "time", term101989);
        setField(term101968, term101968.getClass(), "registerTime", term101984);
        setIntField(term101995, term101995.getClass(), "year", 2017);
        setShortField(term101995, term101995.getClass(), "month", (short) 5);
        setShortField(term101995, term101995.getClass(), "day", (short) 17);
        setField(term101994, term101994.getClass(), "date", term101995);
        setByteField(term101999, term101999.getClass(), "hour", (byte) 22);
        setByteField(term101999, term101999.getClass(), "minute", (byte) 56);
        setByteField(term101999, term101999.getClass(), "second", (byte) 28);
        setIntField(term101999, term101999.getClass(), "nano", 581659115);
        setField(term101994, term101994.getClass(), "time", term101999);
        setField(term101968, term101968.getClass(), "accessTime", term101994);
        setField(term101966, term101966.getClass(), "card", term101968);
        setField(term101966, term101966.getClass(), "userName", "QJTDOLXoVI");
        setIntField(term101966, term101966.getClass(), "isNetMember", 23263320);
        setIntField(term101966, term101966.getClass(), "iconId", -920008974);
        setIntField(term101966, term101966.getClass(), "plateId", 988815004);
        setIntField(term101966, term101966.getClass(), "titleId", 2114316862);
        setIntField(term101966, term101966.getClass(), "partnerId", 2030575861);
        setIntField(term101966, term101966.getClass(), "frameId", -320011647);
        setIntField(term101966, term101966.getClass(), "selectMapId", 1489536288);
        setIntField(term101966, term101966.getClass(), "totalAwake", -1536885597);
        setIntField(term101966, term101966.getClass(), "gradeRating", -1906904065);
        setIntField(term101966, term101966.getClass(), "musicRating", -1325607039);
        setIntField(term101966, term101966.getClass(), "playerRating", 43806434);
        setIntField(term101966, term101966.getClass(), "highestRating", 1869537390);
        setIntField(term101966, term101966.getClass(), "gradeRank", -912321180);
        setIntField(term101966, term101966.getClass(), "classRank", 332710777);
        setIntField(term101966, term101966.getClass(), "courseRank", 1307238592);
        setField(term101966, term101966.getClass(), "charaSlot", term102031);
        setField(term101966, term101966.getClass(), "charaLockSlot", term102041);
        setLongField(term101966, term101966.getClass(), "contentBit", 3650995192859131287L);
        setIntField(term101966, term101966.getClass(), "playCount", 1917900339);
        setField(term101966, term101966.getClass(), "eventWatchedDate", "MVXNdXioDJ");
        setField(term101966, term101966.getClass(), "lastGameId", "xXscNmBGLP");
        setField(term101966, term101966.getClass(), "lastRomVersion", "DOvWosNzCd");
        setField(term101966, term101966.getClass(), "lastDataVersion", "bIZNWEzBTe");
        setField(term101966, term101966.getClass(), "lastLoginDate", "CVhsNqYDrO");
        setField(term101966, term101966.getClass(), "lastPlayDate", "dMpUbtHwly");
        setIntField(term101966, term101966.getClass(), "lastPlayCredit", -166475832);
        setIntField(term101966, term101966.getClass(), "lastPlayMode", -1426746104);
        setIntField(term101966, term101966.getClass(), "lastPlaceId", 1293555421);
        setField(term101966, term101966.getClass(), "lastPlaceName", "bxEEJVIcPG");
        setIntField(term101966, term101966.getClass(), "lastAllNetId", -1861656988);
        setIntField(term101966, term101966.getClass(), "lastRegionId", -2030143064);
        setField(term101966, term101966.getClass(), "lastRegionName", "UttOGDGpEr");
        setField(term101966, term101966.getClass(), "lastClientId", "aPScTdSsoS");
        setField(term101966, term101966.getClass(), "lastCountryCode", "CZYngwdoHw");
        setIntField(term101966, term101966.getClass(), "lastSelectEMoney", 2036980797);
        setIntField(term101966, term101966.getClass(), "lastSelectTicket", -935931812);
        setIntField(term101966, term101966.getClass(), "lastSelectCourse", 1486721984);
        setIntField(term101966, term101966.getClass(), "lastCountCourse", 279609538);
        setField(term101966, term101966.getClass(), "firstGameId", "ZbWZNiPrBA");
        setField(term101966, term101966.getClass(), "firstRomVersion", "ilMWoyWLja");
        setField(term101966, term101966.getClass(), "firstDataVersion", "DejzaVMRwf");
        setField(term101966, term101966.getClass(), "firstPlayDate", "vpcvPRFXOI");
        setField(term101966, term101966.getClass(), "compatibleCmVersion", "LpBQSpICQX");
        setField(term101966, term101966.getClass(), "dailyBonusDate", "uPhRdRCFnR");
        setField(term101966, term101966.getClass(), "dailyCourseBonusDate", "HdiCCAVvaY");
        setField(term101966, term101966.getClass(), "lastPairLoginDate", "UrAeseWSFd");
        setField(term101966, term101966.getClass(), "lastTrialPlayDate", "udLLyuUbuM");
        setIntField(term101966, term101966.getClass(), "playVsCount", -1364161498);
        setIntField(term101966, term101966.getClass(), "playSyncCount", -1602874517);
        setIntField(term101966, term101966.getClass(), "winCount", 522533128);
        setIntField(term101966, term101966.getClass(), "helpCount", 2076616628);
        setIntField(term101966, term101966.getClass(), "comboCount", -138960474);
        setLongField(term101966, term101966.getClass(), "totalDeluxscore", -3086678982095395565L);
        setLongField(term101966, term101966.getClass(), "totalBasicDeluxscore", 1848320676893390599L);
        setLongField(term101966, term101966.getClass(), "totalAdvancedDeluxscore", 1438339111595747474L);
        setLongField(term101966, term101966.getClass(), "totalExpertDeluxscore", -1978911449948440575L);
        setLongField(term101966, term101966.getClass(), "totalMasterDeluxscore", 482416668389920900L);
        setLongField(term101966, term101966.getClass(), "totalReMasterDeluxscore", -3964336945442391045L);
        setIntField(term101966, term101966.getClass(), "totalSync", 541109635);
        setIntField(term101966, term101966.getClass(), "totalBasicSync", -1533186568);
        setIntField(term101966, term101966.getClass(), "totalAdvancedSync", 916419043);
        setIntField(term101966, term101966.getClass(), "totalExpertSync", 467264395);
        setIntField(term101966, term101966.getClass(), "totalMasterSync", 943715309);
        setIntField(term101966, term101966.getClass(), "totalReMasterSync", 2013085557);
        setLongField(term101966, term101966.getClass(), "totalAchievement", 2818114510564918206L);
        setLongField(term101966, term101966.getClass(), "totalBasicAchievement", 7128237547581493118L);
        setLongField(term101966, term101966.getClass(), "totalAdvancedAchievement", 8262871428738402744L);
        setLongField(term101966, term101966.getClass(), "totalExpertAchievement", 5606154445066593103L);
        setLongField(term101966, term101966.getClass(), "totalMasterAchievement", -7335787677736088501L);
        setLongField(term101966, term101966.getClass(), "totalReMasterAchievement", 7236813175472844239L);
        setLongField(term101966, term101966.getClass(), "playerOldRating", -7739439789625036356L);
        setLongField(term101966, term101966.getClass(), "playerNewRating", 4789315248360898212L);
        setIntField(term101966, term101966.getClass(), "banState", -1067501154);
        setLongField(term101966, term101966.getClass(), "dateTime", 5111712960135140088L);
        setField(term101964, term101964.getClass(), "user", term101966);
        setIntField(term101964, term101964.getClass(), "rate", -479195168);
        setIntField(term101964, term101964.getClass(), "maxRate", -1151891321);
        setIntField(term101964, term101964.getClass(), "classValue", 1141278466);
        setIntField(term101964, term101964.getClass(), "maxClassValue", -1649439614);
        setIntField(term101964, term101964.getClass(), "totalWinNum", 498535038);
        setIntField(term101964, term101964.getClass(), "totalLoseNum", -135256376);
        setIntField(term101964, term101964.getClass(), "maxWinNum", -1073689224);
        setIntField(term101964, term101964.getClass(), "maxLoseNum", -706123233);
        setIntField(term101964, term101964.getClass(), "winNum", 1037164777);
        setIntField(term101964, term101964.getClass(), "loseNum", -1061962496);
        setIntField(term101964, term101964.getClass(), "npcTotalWinNum", -1456265994);
        setIntField(term101964, term101964.getClass(), "npcTotalLoseNum", 716720347);
        setIntField(term101964, term101964.getClass(), "npcMaxWinNum", -1144539304);
        setIntField(term101964, term101964.getClass(), "npcMaxLoseNum", -1038395932);
        setIntField(term101964, term101964.getClass(), "npcWinNum", 1842163221);
        setIntField(term101964, term101964.getClass(), "npcLoseNum", 468583702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcTotalWinNum", argTypes, term101964, args);
    }

};


