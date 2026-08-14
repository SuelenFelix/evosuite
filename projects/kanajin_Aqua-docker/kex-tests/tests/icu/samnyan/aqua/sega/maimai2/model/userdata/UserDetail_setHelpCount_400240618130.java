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

public class UserDetail_setHelpCount_400240618130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269674;
     Object term270031;

    public UserDetail_setHelpCount_400240618130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269678 = new Long(-6237686742902369498L);
        ArrayList term269739 = new ArrayList();
        Integer term269745 = new Integer(-375101902);
        Integer term269747 = new Integer(-400603688);
        Integer term269749 = new Integer(2063246363);
        Integer term269751 = new Integer(1989206053);
        Integer term269753 = new Integer(68383055);
        Integer term269755 = new Integer(-2072291494);
        Integer term269757 = new Integer(1818270937);
        Integer term269759 = new Integer(-1309831162);
        Integer term269761 = new Integer(711539163);
        ArrayList term269743 = new ArrayList();
        ((ArrayList) term269743).add(term269745);
        ((ArrayList) term269743).add(term269747);
        ((ArrayList) term269743).add(term269749);
        ((ArrayList) term269743).add(term269751);
        ((ArrayList) term269743).add(term269753);
        ((ArrayList) term269743).add(term269755);
        ((ArrayList) term269743).add(term269757);
        ((ArrayList) term269743).add(term269759);
        ((ArrayList) term269743).add(term269761);
        term269674 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term269676 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term269692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term269702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269707 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term269674, term269674.getClass(), "id", 4209865593774830889L);
        setLongField(term269676, term269676.getClass(), "id", 6631475745348473315L);
        setField(term269676, term269676.getClass(), "extId", term269678);
        setField(term269676, term269676.getClass(), "luid", "HfTMHxIhyF");
        setIntField(term269693, term269693.getClass(), "year", 2014);
        setShortField(term269693, term269693.getClass(), "month", (short) 1);
        setShortField(term269693, term269693.getClass(), "day", (short) 7);
        setField(term269692, term269692.getClass(), "date", term269693);
        setByteField(term269697, term269697.getClass(), "hour", (byte) 16);
        setByteField(term269697, term269697.getClass(), "minute", (byte) 12);
        setByteField(term269697, term269697.getClass(), "second", (byte) 5);
        setIntField(term269697, term269697.getClass(), "nano", 977610129);
        setField(term269692, term269692.getClass(), "time", term269697);
        setField(term269676, term269676.getClass(), "registerTime", term269692);
        setIntField(term269703, term269703.getClass(), "year", 2010);
        setShortField(term269703, term269703.getClass(), "month", (short) 7);
        setShortField(term269703, term269703.getClass(), "day", (short) 7);
        setField(term269702, term269702.getClass(), "date", term269703);
        setByteField(term269707, term269707.getClass(), "hour", (byte) 6);
        setByteField(term269707, term269707.getClass(), "minute", (byte) 57);
        setByteField(term269707, term269707.getClass(), "second", (byte) 11);
        setIntField(term269707, term269707.getClass(), "nano", 667015440);
        setField(term269702, term269702.getClass(), "time", term269707);
        setField(term269676, term269676.getClass(), "accessTime", term269702);
        setField(term269674, term269674.getClass(), "card", term269676);
        setField(term269674, term269674.getClass(), "userName", "nwmhNXaAzK");
        setIntField(term269674, term269674.getClass(), "isNetMember", -1449195775);
        setIntField(term269674, term269674.getClass(), "iconId", -1672891522);
        setIntField(term269674, term269674.getClass(), "plateId", 450527358);
        setIntField(term269674, term269674.getClass(), "titleId", 1266563944);
        setIntField(term269674, term269674.getClass(), "partnerId", -1037900319);
        setIntField(term269674, term269674.getClass(), "frameId", 1725853427);
        setIntField(term269674, term269674.getClass(), "selectMapId", -1280054116);
        setIntField(term269674, term269674.getClass(), "totalAwake", -1336523486);
        setIntField(term269674, term269674.getClass(), "gradeRating", -1709511631);
        setIntField(term269674, term269674.getClass(), "musicRating", 371774191);
        setIntField(term269674, term269674.getClass(), "playerRating", 1533723632);
        setIntField(term269674, term269674.getClass(), "highestRating", -1563972078);
        setIntField(term269674, term269674.getClass(), "gradeRank", 2067438905);
        setIntField(term269674, term269674.getClass(), "classRank", 907155632);
        setIntField(term269674, term269674.getClass(), "courseRank", 1020668073);
        setField(term269674, term269674.getClass(), "charaSlot", term269739);
        setField(term269674, term269674.getClass(), "charaLockSlot", term269743);
        setLongField(term269674, term269674.getClass(), "contentBit", 2943038288222012096L);
        setIntField(term269674, term269674.getClass(), "playCount", -455157694);
        setField(term269674, term269674.getClass(), "eventWatchedDate", "AHKEcReWeg");
        setField(term269674, term269674.getClass(), "lastGameId", "vQJCcjYzFl");
        setField(term269674, term269674.getClass(), "lastRomVersion", "mXQgfYcOFG");
        setField(term269674, term269674.getClass(), "lastDataVersion", "sXBPfVUQIw");
        setField(term269674, term269674.getClass(), "lastLoginDate", "uVQuCdoyqo");
        setField(term269674, term269674.getClass(), "lastPlayDate", "idDWMqSfdr");
        setIntField(term269674, term269674.getClass(), "lastPlayCredit", 1944477395);
        setIntField(term269674, term269674.getClass(), "lastPlayMode", -273262792);
        setIntField(term269674, term269674.getClass(), "lastPlaceId", -468983435);
        setField(term269674, term269674.getClass(), "lastPlaceName", "COnaqgWCuo");
        setIntField(term269674, term269674.getClass(), "lastAllNetId", -1977167838);
        setIntField(term269674, term269674.getClass(), "lastRegionId", -214374321);
        setField(term269674, term269674.getClass(), "lastRegionName", "vnCQFMDnJC");
        setField(term269674, term269674.getClass(), "lastClientId", "bCkDkObuRH");
        setField(term269674, term269674.getClass(), "lastCountryCode", "fXsvnPoTrp");
        setIntField(term269674, term269674.getClass(), "lastSelectEMoney", 1267044964);
        setIntField(term269674, term269674.getClass(), "lastSelectTicket", 1483717887);
        setIntField(term269674, term269674.getClass(), "lastSelectCourse", 424625087);
        setIntField(term269674, term269674.getClass(), "lastCountCourse", 884358038);
        setField(term269674, term269674.getClass(), "firstGameId", "nfPBEOploM");
        setField(term269674, term269674.getClass(), "firstRomVersion", "geOXZNZZIn");
        setField(term269674, term269674.getClass(), "firstDataVersion", "WklUkZmIds");
        setField(term269674, term269674.getClass(), "firstPlayDate", "qsaAfuuDnj");
        setField(term269674, term269674.getClass(), "compatibleCmVersion", "AwwrbMzNDx");
        setField(term269674, term269674.getClass(), "dailyBonusDate", "IaqOJMthEm");
        setField(term269674, term269674.getClass(), "dailyCourseBonusDate", "WqzNDQfLBu");
        setField(term269674, term269674.getClass(), "lastPairLoginDate", "dpnIixBhZZ");
        setField(term269674, term269674.getClass(), "lastTrialPlayDate", "pxPStUWNTS");
        setIntField(term269674, term269674.getClass(), "playVsCount", -1115805891);
        setIntField(term269674, term269674.getClass(), "playSyncCount", 72821177);
        setIntField(term269674, term269674.getClass(), "winCount", 132004149);
        setIntField(term269674, term269674.getClass(), "helpCount", 1607634065);
        setIntField(term269674, term269674.getClass(), "comboCount", -844027507);
        setLongField(term269674, term269674.getClass(), "totalDeluxscore", -8367765384475026597L);
        setLongField(term269674, term269674.getClass(), "totalBasicDeluxscore", -3673682477822894417L);
        setLongField(term269674, term269674.getClass(), "totalAdvancedDeluxscore", 3314288974852458999L);
        setLongField(term269674, term269674.getClass(), "totalExpertDeluxscore", -145863482172982209L);
        setLongField(term269674, term269674.getClass(), "totalMasterDeluxscore", -6170394822293795703L);
        setLongField(term269674, term269674.getClass(), "totalReMasterDeluxscore", -4032917634135050566L);
        setIntField(term269674, term269674.getClass(), "totalSync", -35125797);
        setIntField(term269674, term269674.getClass(), "totalBasicSync", 732051554);
        setIntField(term269674, term269674.getClass(), "totalAdvancedSync", -252331317);
        setIntField(term269674, term269674.getClass(), "totalExpertSync", 1228310197);
        setIntField(term269674, term269674.getClass(), "totalMasterSync", 700836778);
        setIntField(term269674, term269674.getClass(), "totalReMasterSync", 2008079324);
        setLongField(term269674, term269674.getClass(), "totalAchievement", 2174526577582352297L);
        setLongField(term269674, term269674.getClass(), "totalBasicAchievement", 5177537048239467273L);
        setLongField(term269674, term269674.getClass(), "totalAdvancedAchievement", 1418107115018084861L);
        setLongField(term269674, term269674.getClass(), "totalExpertAchievement", -2296733999435790434L);
        setLongField(term269674, term269674.getClass(), "totalMasterAchievement", 2553671869495914682L);
        setLongField(term269674, term269674.getClass(), "totalReMasterAchievement", 4525353930317084307L);
        setLongField(term269674, term269674.getClass(), "playerOldRating", -6893116924722599830L);
        setLongField(term269674, term269674.getClass(), "playerNewRating", -6729563409020942829L);
        setIntField(term269674, term269674.getClass(), "banState", 554320212);
        setLongField(term269674, term269674.getClass(), "dateTime", 3008425782902912495L);
        term270031 = new Integer(-1547697731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term270031;
        callMethod(klass, "setHelpCount", argTypes, term269674, args);
    }

};


