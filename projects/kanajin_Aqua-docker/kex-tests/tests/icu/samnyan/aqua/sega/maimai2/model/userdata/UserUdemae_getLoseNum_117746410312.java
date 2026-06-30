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

public class UserUdemae_getLoseNum_117746410312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101373;

    public UserUdemae_getLoseNum_117746410312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101379 = new Long(1195529027276497124L);
        Integer term101442 = new Integer(155423433);
        Integer term101444 = new Integer(-815471632);
        Integer term101446 = new Integer(-1469668708);
        Integer term101448 = new Integer(1796950482);
        Integer term101450 = new Integer(-945759470);
        ArrayList term101440 = new ArrayList();
        ((ArrayList) term101440).add(term101442);
        ((ArrayList) term101440).add(term101444);
        ((ArrayList) term101440).add(term101446);
        ((ArrayList) term101440).add(term101448);
        ((ArrayList) term101440).add(term101450);
        Integer term101456 = new Integer(657342039);
        Integer term101458 = new Integer(1483999606);
        Integer term101460 = new Integer(1871761182);
        Integer term101462 = new Integer(233983728);
        Integer term101464 = new Integer(-1650132476);
        Integer term101466 = new Integer(1719680265);
        Integer term101468 = new Integer(-1890898783);
        ArrayList term101454 = new ArrayList();
        ((ArrayList) term101454).add(term101456);
        ((ArrayList) term101454).add(term101458);
        ((ArrayList) term101454).add(term101460);
        ((ArrayList) term101454).add(term101462);
        ((ArrayList) term101454).add(term101464);
        ((ArrayList) term101454).add(term101466);
        ((ArrayList) term101454).add(term101468);
        term101373 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term101375 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term101377 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101408 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101373, term101373.getClass(), "id", 3940048705672410963L);
        setLongField(term101375, term101375.getClass(), "id", -595318203552657623L);
        setLongField(term101377, term101377.getClass(), "id", 6148234968144914875L);
        setField(term101377, term101377.getClass(), "extId", term101379);
        setField(term101377, term101377.getClass(), "luid", "lBruaTAkIt");
        setIntField(term101394, term101394.getClass(), "year", 2014);
        setShortField(term101394, term101394.getClass(), "month", (short) 2);
        setShortField(term101394, term101394.getClass(), "day", (short) 18);
        setField(term101393, term101393.getClass(), "date", term101394);
        setByteField(term101398, term101398.getClass(), "hour", (byte) 4);
        setByteField(term101398, term101398.getClass(), "minute", (byte) 16);
        setByteField(term101398, term101398.getClass(), "second", (byte) 8);
        setIntField(term101398, term101398.getClass(), "nano", 486006871);
        setField(term101393, term101393.getClass(), "time", term101398);
        setField(term101377, term101377.getClass(), "registerTime", term101393);
        setIntField(term101404, term101404.getClass(), "year", 2024);
        setShortField(term101404, term101404.getClass(), "month", (short) 10);
        setShortField(term101404, term101404.getClass(), "day", (short) 8);
        setField(term101403, term101403.getClass(), "date", term101404);
        setByteField(term101408, term101408.getClass(), "hour", (byte) 19);
        setByteField(term101408, term101408.getClass(), "minute", (byte) 31);
        setByteField(term101408, term101408.getClass(), "second", (byte) 10);
        setIntField(term101408, term101408.getClass(), "nano", 930417883);
        setField(term101403, term101403.getClass(), "time", term101408);
        setField(term101377, term101377.getClass(), "accessTime", term101403);
        setField(term101375, term101375.getClass(), "card", term101377);
        setField(term101375, term101375.getClass(), "userName", "pIQQBEGLOF");
        setIntField(term101375, term101375.getClass(), "isNetMember", 438683830);
        setIntField(term101375, term101375.getClass(), "iconId", -317562794);
        setIntField(term101375, term101375.getClass(), "plateId", -34216116);
        setIntField(term101375, term101375.getClass(), "titleId", -1708491247);
        setIntField(term101375, term101375.getClass(), "partnerId", -481096333);
        setIntField(term101375, term101375.getClass(), "frameId", -1194124828);
        setIntField(term101375, term101375.getClass(), "selectMapId", -1785183910);
        setIntField(term101375, term101375.getClass(), "totalAwake", -152121998);
        setIntField(term101375, term101375.getClass(), "gradeRating", 494798237);
        setIntField(term101375, term101375.getClass(), "musicRating", -479962725);
        setIntField(term101375, term101375.getClass(), "playerRating", 686601903);
        setIntField(term101375, term101375.getClass(), "highestRating", 1265406504);
        setIntField(term101375, term101375.getClass(), "gradeRank", 1628889441);
        setIntField(term101375, term101375.getClass(), "classRank", 2054724659);
        setIntField(term101375, term101375.getClass(), "courseRank", -1112261724);
        setField(term101375, term101375.getClass(), "charaSlot", term101440);
        setField(term101375, term101375.getClass(), "charaLockSlot", term101454);
        setLongField(term101375, term101375.getClass(), "contentBit", -3787619679141862761L);
        setIntField(term101375, term101375.getClass(), "playCount", 439199675);
        setField(term101375, term101375.getClass(), "eventWatchedDate", "DLYPXnIorY");
        setField(term101375, term101375.getClass(), "lastGameId", "MaEbckWDBJ");
        setField(term101375, term101375.getClass(), "lastRomVersion", "kxuScrxaGm");
        setField(term101375, term101375.getClass(), "lastDataVersion", "ItamIWoOLr");
        setField(term101375, term101375.getClass(), "lastLoginDate", "YeemjiDgab");
        setField(term101375, term101375.getClass(), "lastPlayDate", "tihFwBkjdt");
        setIntField(term101375, term101375.getClass(), "lastPlayCredit", 1708450733);
        setIntField(term101375, term101375.getClass(), "lastPlayMode", -1788885241);
        setIntField(term101375, term101375.getClass(), "lastPlaceId", 1187649321);
        setField(term101375, term101375.getClass(), "lastPlaceName", "llYGfgCigY");
        setIntField(term101375, term101375.getClass(), "lastAllNetId", 1329212097);
        setIntField(term101375, term101375.getClass(), "lastRegionId", 325911335);
        setField(term101375, term101375.getClass(), "lastRegionName", "WToYKUjMGj");
        setField(term101375, term101375.getClass(), "lastClientId", "wbtDRRVkMv");
        setField(term101375, term101375.getClass(), "lastCountryCode", "abzzbYwTRo");
        setIntField(term101375, term101375.getClass(), "lastSelectEMoney", -2141919241);
        setIntField(term101375, term101375.getClass(), "lastSelectTicket", -1932169512);
        setIntField(term101375, term101375.getClass(), "lastSelectCourse", 1375409503);
        setIntField(term101375, term101375.getClass(), "lastCountCourse", 2036147808);
        setField(term101375, term101375.getClass(), "firstGameId", "HxIZqtNMYu");
        setField(term101375, term101375.getClass(), "firstRomVersion", "NVlTBmmeHa");
        setField(term101375, term101375.getClass(), "firstDataVersion", "QZomwNJvGF");
        setField(term101375, term101375.getClass(), "firstPlayDate", "qfHzTgyYaj");
        setField(term101375, term101375.getClass(), "compatibleCmVersion", "BzOSSnQpxM");
        setField(term101375, term101375.getClass(), "dailyBonusDate", "LoFkuWLahf");
        setField(term101375, term101375.getClass(), "dailyCourseBonusDate", "GwcCGdSyQT");
        setField(term101375, term101375.getClass(), "lastPairLoginDate", "pQLjQOCQOz");
        setField(term101375, term101375.getClass(), "lastTrialPlayDate", "RaVKdrEtNk");
        setIntField(term101375, term101375.getClass(), "playVsCount", 1846382479);
        setIntField(term101375, term101375.getClass(), "playSyncCount", -461438905);
        setIntField(term101375, term101375.getClass(), "winCount", -1878286321);
        setIntField(term101375, term101375.getClass(), "helpCount", 867331913);
        setIntField(term101375, term101375.getClass(), "comboCount", -1360909976);
        setLongField(term101375, term101375.getClass(), "totalDeluxscore", 3595654468325902203L);
        setLongField(term101375, term101375.getClass(), "totalBasicDeluxscore", -5890498762874763812L);
        setLongField(term101375, term101375.getClass(), "totalAdvancedDeluxscore", 336723219273701338L);
        setLongField(term101375, term101375.getClass(), "totalExpertDeluxscore", 6556523216612833778L);
        setLongField(term101375, term101375.getClass(), "totalMasterDeluxscore", -5995037992334109399L);
        setLongField(term101375, term101375.getClass(), "totalReMasterDeluxscore", 95336991964157322L);
        setIntField(term101375, term101375.getClass(), "totalSync", 507026333);
        setIntField(term101375, term101375.getClass(), "totalBasicSync", 632908451);
        setIntField(term101375, term101375.getClass(), "totalAdvancedSync", -1776006683);
        setIntField(term101375, term101375.getClass(), "totalExpertSync", 7927502);
        setIntField(term101375, term101375.getClass(), "totalMasterSync", 1449735015);
        setIntField(term101375, term101375.getClass(), "totalReMasterSync", -2039500407);
        setLongField(term101375, term101375.getClass(), "totalAchievement", -7344726906694816984L);
        setLongField(term101375, term101375.getClass(), "totalBasicAchievement", -7696292233533783029L);
        setLongField(term101375, term101375.getClass(), "totalAdvancedAchievement", -8210490799564687448L);
        setLongField(term101375, term101375.getClass(), "totalExpertAchievement", 356741222742175961L);
        setLongField(term101375, term101375.getClass(), "totalMasterAchievement", -8559116967513378447L);
        setLongField(term101375, term101375.getClass(), "totalReMasterAchievement", 8349089013897192154L);
        setLongField(term101375, term101375.getClass(), "playerOldRating", -8293657191511549595L);
        setLongField(term101375, term101375.getClass(), "playerNewRating", 983004662906620981L);
        setIntField(term101375, term101375.getClass(), "banState", -968543680);
        setLongField(term101375, term101375.getClass(), "dateTime", 3758170717522532837L);
        setField(term101373, term101373.getClass(), "user", term101375);
        setIntField(term101373, term101373.getClass(), "rate", -1689022557);
        setIntField(term101373, term101373.getClass(), "maxRate", 1722389932);
        setIntField(term101373, term101373.getClass(), "classValue", 944378703);
        setIntField(term101373, term101373.getClass(), "maxClassValue", 69559711);
        setIntField(term101373, term101373.getClass(), "totalWinNum", -1086780030);
        setIntField(term101373, term101373.getClass(), "totalLoseNum", 250290750);
        setIntField(term101373, term101373.getClass(), "maxWinNum", 248490601);
        setIntField(term101373, term101373.getClass(), "maxLoseNum", 2110976760);
        setIntField(term101373, term101373.getClass(), "winNum", -1837808345);
        setIntField(term101373, term101373.getClass(), "loseNum", 1898123858);
        setIntField(term101373, term101373.getClass(), "npcTotalWinNum", 161447730);
        setIntField(term101373, term101373.getClass(), "npcTotalLoseNum", -1595547996);
        setIntField(term101373, term101373.getClass(), "npcMaxWinNum", -997740019);
        setIntField(term101373, term101373.getClass(), "npcMaxLoseNum", -257284782);
        setIntField(term101373, term101373.getClass(), "npcWinNum", -1864133072);
        setIntField(term101373, term101373.getClass(), "npcLoseNum", 1425952082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoseNum", argTypes, term101373, args);
    }

};


