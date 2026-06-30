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

public class UserDetail_setHelpCount_400240618131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269729;
     Object term270086;

    public UserDetail_setHelpCount_400240618131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269733 = new Long(-6237686742902369498L);
        ArrayList term269794 = new ArrayList();
        Integer term269800 = new Integer(-375101902);
        Integer term269802 = new Integer(-400603688);
        Integer term269804 = new Integer(2063246363);
        Integer term269806 = new Integer(1989206053);
        Integer term269808 = new Integer(68383055);
        Integer term269810 = new Integer(-2072291494);
        Integer term269812 = new Integer(1818270937);
        Integer term269814 = new Integer(-1309831162);
        Integer term269816 = new Integer(711539163);
        ArrayList term269798 = new ArrayList();
        ((ArrayList) term269798).add(term269800);
        ((ArrayList) term269798).add(term269802);
        ((ArrayList) term269798).add(term269804);
        ((ArrayList) term269798).add(term269806);
        ((ArrayList) term269798).add(term269808);
        ((ArrayList) term269798).add(term269810);
        ((ArrayList) term269798).add(term269812);
        ((ArrayList) term269798).add(term269814);
        ((ArrayList) term269798).add(term269816);
        term269729 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term269731 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term269747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269752 = newInstance(Class.forName("java.time.LocalTime"));
        Object term269757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269762 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term269729, term269729.getClass(), "id", 4209865593774830889L);
        setLongField(term269731, term269731.getClass(), "id", 6631475745348473315L);
        setField(term269731, term269731.getClass(), "extId", term269733);
        setField(term269731, term269731.getClass(), "luid", "HfTMHxIhyF");
        setIntField(term269748, term269748.getClass(), "year", 2014);
        setShortField(term269748, term269748.getClass(), "month", (short) 1);
        setShortField(term269748, term269748.getClass(), "day", (short) 7);
        setField(term269747, term269747.getClass(), "date", term269748);
        setByteField(term269752, term269752.getClass(), "hour", (byte) 16);
        setByteField(term269752, term269752.getClass(), "minute", (byte) 12);
        setByteField(term269752, term269752.getClass(), "second", (byte) 5);
        setIntField(term269752, term269752.getClass(), "nano", 977610129);
        setField(term269747, term269747.getClass(), "time", term269752);
        setField(term269731, term269731.getClass(), "registerTime", term269747);
        setIntField(term269758, term269758.getClass(), "year", 2010);
        setShortField(term269758, term269758.getClass(), "month", (short) 7);
        setShortField(term269758, term269758.getClass(), "day", (short) 7);
        setField(term269757, term269757.getClass(), "date", term269758);
        setByteField(term269762, term269762.getClass(), "hour", (byte) 6);
        setByteField(term269762, term269762.getClass(), "minute", (byte) 57);
        setByteField(term269762, term269762.getClass(), "second", (byte) 11);
        setIntField(term269762, term269762.getClass(), "nano", 667015440);
        setField(term269757, term269757.getClass(), "time", term269762);
        setField(term269731, term269731.getClass(), "accessTime", term269757);
        setField(term269729, term269729.getClass(), "card", term269731);
        setField(term269729, term269729.getClass(), "userName", "nwmhNXaAzK");
        setIntField(term269729, term269729.getClass(), "isNetMember", -1449195775);
        setIntField(term269729, term269729.getClass(), "iconId", -1672891522);
        setIntField(term269729, term269729.getClass(), "plateId", 450527358);
        setIntField(term269729, term269729.getClass(), "titleId", 1266563944);
        setIntField(term269729, term269729.getClass(), "partnerId", -1037900319);
        setIntField(term269729, term269729.getClass(), "frameId", 1725853427);
        setIntField(term269729, term269729.getClass(), "selectMapId", -1280054116);
        setIntField(term269729, term269729.getClass(), "totalAwake", -1336523486);
        setIntField(term269729, term269729.getClass(), "gradeRating", -1709511631);
        setIntField(term269729, term269729.getClass(), "musicRating", 371774191);
        setIntField(term269729, term269729.getClass(), "playerRating", 1533723632);
        setIntField(term269729, term269729.getClass(), "highestRating", -1563972078);
        setIntField(term269729, term269729.getClass(), "gradeRank", 2067438905);
        setIntField(term269729, term269729.getClass(), "classRank", 907155632);
        setIntField(term269729, term269729.getClass(), "courseRank", 1020668073);
        setField(term269729, term269729.getClass(), "charaSlot", term269794);
        setField(term269729, term269729.getClass(), "charaLockSlot", term269798);
        setLongField(term269729, term269729.getClass(), "contentBit", 2943038288222012096L);
        setIntField(term269729, term269729.getClass(), "playCount", -455157694);
        setField(term269729, term269729.getClass(), "eventWatchedDate", "AHKEcReWeg");
        setField(term269729, term269729.getClass(), "lastGameId", "vQJCcjYzFl");
        setField(term269729, term269729.getClass(), "lastRomVersion", "mXQgfYcOFG");
        setField(term269729, term269729.getClass(), "lastDataVersion", "sXBPfVUQIw");
        setField(term269729, term269729.getClass(), "lastLoginDate", "uVQuCdoyqo");
        setField(term269729, term269729.getClass(), "lastPlayDate", "idDWMqSfdr");
        setIntField(term269729, term269729.getClass(), "lastPlayCredit", 1944477395);
        setIntField(term269729, term269729.getClass(), "lastPlayMode", -273262792);
        setIntField(term269729, term269729.getClass(), "lastPlaceId", -468983435);
        setField(term269729, term269729.getClass(), "lastPlaceName", "COnaqgWCuo");
        setIntField(term269729, term269729.getClass(), "lastAllNetId", -1977167838);
        setIntField(term269729, term269729.getClass(), "lastRegionId", -214374321);
        setField(term269729, term269729.getClass(), "lastRegionName", "vnCQFMDnJC");
        setField(term269729, term269729.getClass(), "lastClientId", "bCkDkObuRH");
        setField(term269729, term269729.getClass(), "lastCountryCode", "fXsvnPoTrp");
        setIntField(term269729, term269729.getClass(), "lastSelectEMoney", 1267044964);
        setIntField(term269729, term269729.getClass(), "lastSelectTicket", 1483717887);
        setIntField(term269729, term269729.getClass(), "lastSelectCourse", 424625087);
        setIntField(term269729, term269729.getClass(), "lastCountCourse", 884358038);
        setField(term269729, term269729.getClass(), "firstGameId", "nfPBEOploM");
        setField(term269729, term269729.getClass(), "firstRomVersion", "geOXZNZZIn");
        setField(term269729, term269729.getClass(), "firstDataVersion", "WklUkZmIds");
        setField(term269729, term269729.getClass(), "firstPlayDate", "qsaAfuuDnj");
        setField(term269729, term269729.getClass(), "compatibleCmVersion", "AwwrbMzNDx");
        setField(term269729, term269729.getClass(), "dailyBonusDate", "IaqOJMthEm");
        setField(term269729, term269729.getClass(), "dailyCourseBonusDate", "WqzNDQfLBu");
        setField(term269729, term269729.getClass(), "lastPairLoginDate", "dpnIixBhZZ");
        setField(term269729, term269729.getClass(), "lastTrialPlayDate", "pxPStUWNTS");
        setIntField(term269729, term269729.getClass(), "playVsCount", -1115805891);
        setIntField(term269729, term269729.getClass(), "playSyncCount", 72821177);
        setIntField(term269729, term269729.getClass(), "winCount", 132004149);
        setIntField(term269729, term269729.getClass(), "helpCount", 1607634065);
        setIntField(term269729, term269729.getClass(), "comboCount", -844027507);
        setLongField(term269729, term269729.getClass(), "totalDeluxscore", -8367765384475026597L);
        setLongField(term269729, term269729.getClass(), "totalBasicDeluxscore", -3673682477822894417L);
        setLongField(term269729, term269729.getClass(), "totalAdvancedDeluxscore", 3314288974852458999L);
        setLongField(term269729, term269729.getClass(), "totalExpertDeluxscore", -145863482172982209L);
        setLongField(term269729, term269729.getClass(), "totalMasterDeluxscore", -6170394822293795703L);
        setLongField(term269729, term269729.getClass(), "totalReMasterDeluxscore", -4032917634135050566L);
        setIntField(term269729, term269729.getClass(), "totalSync", -35125797);
        setIntField(term269729, term269729.getClass(), "totalBasicSync", 732051554);
        setIntField(term269729, term269729.getClass(), "totalAdvancedSync", -252331317);
        setIntField(term269729, term269729.getClass(), "totalExpertSync", 1228310197);
        setIntField(term269729, term269729.getClass(), "totalMasterSync", 700836778);
        setIntField(term269729, term269729.getClass(), "totalReMasterSync", 2008079324);
        setLongField(term269729, term269729.getClass(), "totalAchievement", 2174526577582352297L);
        setLongField(term269729, term269729.getClass(), "totalBasicAchievement", 5177537048239467273L);
        setLongField(term269729, term269729.getClass(), "totalAdvancedAchievement", 1418107115018084861L);
        setLongField(term269729, term269729.getClass(), "totalExpertAchievement", -2296733999435790434L);
        setLongField(term269729, term269729.getClass(), "totalMasterAchievement", 2553671869495914682L);
        setLongField(term269729, term269729.getClass(), "totalReMasterAchievement", 4525353930317084307L);
        setLongField(term269729, term269729.getClass(), "playerOldRating", -6893116924722599830L);
        setLongField(term269729, term269729.getClass(), "playerNewRating", -6729563409020942829L);
        setIntField(term269729, term269729.getClass(), "banState", 554320212);
        setLongField(term269729, term269729.getClass(), "dateTime", 3008425782902912495L);
        term270086 = new Integer(-1547697731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term270086;
        callMethod(klass, "setHelpCount", argTypes, term269729, args);
    }

};


