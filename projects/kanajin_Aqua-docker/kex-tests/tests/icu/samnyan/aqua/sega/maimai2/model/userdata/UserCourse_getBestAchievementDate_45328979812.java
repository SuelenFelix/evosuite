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

public class UserCourse_getBestAchievementDate_45328979812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78718;

    public UserCourse_getBestAchievementDate_45328979812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78724 = new Long(3620247240684476031L);
        Integer term78787 = new Integer(-168498989);
        Integer term78789 = new Integer(388247095);
        Integer term78791 = new Integer(-1320402633);
        Integer term78793 = new Integer(919602316);
        Integer term78795 = new Integer(1833713431);
        Integer term78797 = new Integer(-706222608);
        Integer term78799 = new Integer(-2003607923);
        ArrayList term78785 = new ArrayList();
        ((ArrayList) term78785).add(term78787);
        ((ArrayList) term78785).add(term78789);
        ((ArrayList) term78785).add(term78791);
        ((ArrayList) term78785).add(term78793);
        ((ArrayList) term78785).add(term78795);
        ((ArrayList) term78785).add(term78797);
        ((ArrayList) term78785).add(term78799);
        Integer term78805 = new Integer(1378805929);
        Integer term78807 = new Integer(695052304);
        Integer term78809 = new Integer(-179937218);
        Integer term78811 = new Integer(940896043);
        ArrayList term78803 = new ArrayList();
        ((ArrayList) term78803).add(term78805);
        ((ArrayList) term78803).add(term78807);
        ((ArrayList) term78803).add(term78809);
        ((ArrayList) term78803).add(term78811);
        term78718 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term78720 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term78722 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78743 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78753 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78718, term78718.getClass(), "id", 7042770535756514171L);
        setLongField(term78720, term78720.getClass(), "id", -575552490673780150L);
        setLongField(term78722, term78722.getClass(), "id", -923885290718800192L);
        setField(term78722, term78722.getClass(), "extId", term78724);
        setField(term78722, term78722.getClass(), "luid", "nNjXJbBqnD");
        setIntField(term78739, term78739.getClass(), "year", 2025);
        setShortField(term78739, term78739.getClass(), "month", (short) 2);
        setShortField(term78739, term78739.getClass(), "day", (short) 23);
        setField(term78738, term78738.getClass(), "date", term78739);
        setByteField(term78743, term78743.getClass(), "hour", (byte) 16);
        setByteField(term78743, term78743.getClass(), "minute", (byte) 39);
        setByteField(term78743, term78743.getClass(), "second", (byte) 42);
        setIntField(term78743, term78743.getClass(), "nano", 342777686);
        setField(term78738, term78738.getClass(), "time", term78743);
        setField(term78722, term78722.getClass(), "registerTime", term78738);
        setIntField(term78749, term78749.getClass(), "year", 2029);
        setShortField(term78749, term78749.getClass(), "month", (short) 8);
        setShortField(term78749, term78749.getClass(), "day", (short) 14);
        setField(term78748, term78748.getClass(), "date", term78749);
        setByteField(term78753, term78753.getClass(), "hour", (byte) 10);
        setByteField(term78753, term78753.getClass(), "minute", (byte) 28);
        setByteField(term78753, term78753.getClass(), "second", (byte) 23);
        setIntField(term78753, term78753.getClass(), "nano", 676524979);
        setField(term78748, term78748.getClass(), "time", term78753);
        setField(term78722, term78722.getClass(), "accessTime", term78748);
        setField(term78720, term78720.getClass(), "card", term78722);
        setField(term78720, term78720.getClass(), "userName", "IPIWZFytSS");
        setIntField(term78720, term78720.getClass(), "isNetMember", -598781625);
        setIntField(term78720, term78720.getClass(), "iconId", -1717992579);
        setIntField(term78720, term78720.getClass(), "plateId", 271835355);
        setIntField(term78720, term78720.getClass(), "titleId", -715995272);
        setIntField(term78720, term78720.getClass(), "partnerId", 1175202910);
        setIntField(term78720, term78720.getClass(), "frameId", 1984427818);
        setIntField(term78720, term78720.getClass(), "selectMapId", 163785192);
        setIntField(term78720, term78720.getClass(), "totalAwake", 699884037);
        setIntField(term78720, term78720.getClass(), "gradeRating", -151920832);
        setIntField(term78720, term78720.getClass(), "musicRating", 1800895955);
        setIntField(term78720, term78720.getClass(), "playerRating", 1475225110);
        setIntField(term78720, term78720.getClass(), "highestRating", -746882829);
        setIntField(term78720, term78720.getClass(), "gradeRank", 1303334365);
        setIntField(term78720, term78720.getClass(), "classRank", 931490251);
        setIntField(term78720, term78720.getClass(), "courseRank", -1812785070);
        setField(term78720, term78720.getClass(), "charaSlot", term78785);
        setField(term78720, term78720.getClass(), "charaLockSlot", term78803);
        setLongField(term78720, term78720.getClass(), "contentBit", -7721155272042062465L);
        setIntField(term78720, term78720.getClass(), "playCount", -1062041611);
        setField(term78720, term78720.getClass(), "eventWatchedDate", "BOKRfsJbBj");
        setField(term78720, term78720.getClass(), "lastGameId", "AbIDnsFOzO");
        setField(term78720, term78720.getClass(), "lastRomVersion", "ekTUXbqVGx");
        setField(term78720, term78720.getClass(), "lastDataVersion", "ECPFDcnHIT");
        setField(term78720, term78720.getClass(), "lastLoginDate", "cgHejOgcDW");
        setField(term78720, term78720.getClass(), "lastPlayDate", "QYNTEJcWIQ");
        setIntField(term78720, term78720.getClass(), "lastPlayCredit", -2077054717);
        setIntField(term78720, term78720.getClass(), "lastPlayMode", 93713831);
        setIntField(term78720, term78720.getClass(), "lastPlaceId", 1530899774);
        setField(term78720, term78720.getClass(), "lastPlaceName", "SbdSVclvuX");
        setIntField(term78720, term78720.getClass(), "lastAllNetId", 556786794);
        setIntField(term78720, term78720.getClass(), "lastRegionId", 2062913883);
        setField(term78720, term78720.getClass(), "lastRegionName", "QpoSxHFuJh");
        setField(term78720, term78720.getClass(), "lastClientId", "GLAJgnHQMo");
        setField(term78720, term78720.getClass(), "lastCountryCode", "nDzlNeexNi");
        setIntField(term78720, term78720.getClass(), "lastSelectEMoney", 873881120);
        setIntField(term78720, term78720.getClass(), "lastSelectTicket", 1451809092);
        setIntField(term78720, term78720.getClass(), "lastSelectCourse", -274316319);
        setIntField(term78720, term78720.getClass(), "lastCountCourse", -403442279);
        setField(term78720, term78720.getClass(), "firstGameId", "XhILAYdtGS");
        setField(term78720, term78720.getClass(), "firstRomVersion", "ZRWORAfStn");
        setField(term78720, term78720.getClass(), "firstDataVersion", "loCxNBoGfW");
        setField(term78720, term78720.getClass(), "firstPlayDate", "PGVYUjJrZh");
        setField(term78720, term78720.getClass(), "compatibleCmVersion", "OHliEqVque");
        setField(term78720, term78720.getClass(), "dailyBonusDate", "kQWmmbQQqu");
        setField(term78720, term78720.getClass(), "dailyCourseBonusDate", "bLKLlXYEeh");
        setField(term78720, term78720.getClass(), "lastPairLoginDate", "amltyOnIBK");
        setField(term78720, term78720.getClass(), "lastTrialPlayDate", "hjGlJibBAS");
        setIntField(term78720, term78720.getClass(), "playVsCount", 269235773);
        setIntField(term78720, term78720.getClass(), "playSyncCount", 87688173);
        setIntField(term78720, term78720.getClass(), "winCount", 979019488);
        setIntField(term78720, term78720.getClass(), "helpCount", 1853235183);
        setIntField(term78720, term78720.getClass(), "comboCount", 2097371569);
        setLongField(term78720, term78720.getClass(), "totalDeluxscore", -3609905362646270267L);
        setLongField(term78720, term78720.getClass(), "totalBasicDeluxscore", -2000451137378760129L);
        setLongField(term78720, term78720.getClass(), "totalAdvancedDeluxscore", 1101988351761375103L);
        setLongField(term78720, term78720.getClass(), "totalExpertDeluxscore", 3578367247532414586L);
        setLongField(term78720, term78720.getClass(), "totalMasterDeluxscore", -2559231705850769990L);
        setLongField(term78720, term78720.getClass(), "totalReMasterDeluxscore", -1061715269956397020L);
        setIntField(term78720, term78720.getClass(), "totalSync", -10808205);
        setIntField(term78720, term78720.getClass(), "totalBasicSync", -774591519);
        setIntField(term78720, term78720.getClass(), "totalAdvancedSync", 1785308866);
        setIntField(term78720, term78720.getClass(), "totalExpertSync", 1881022849);
        setIntField(term78720, term78720.getClass(), "totalMasterSync", -1443744876);
        setIntField(term78720, term78720.getClass(), "totalReMasterSync", 1913818780);
        setLongField(term78720, term78720.getClass(), "totalAchievement", -8348777841777993085L);
        setLongField(term78720, term78720.getClass(), "totalBasicAchievement", 3281687079413025082L);
        setLongField(term78720, term78720.getClass(), "totalAdvancedAchievement", -3122487376211578679L);
        setLongField(term78720, term78720.getClass(), "totalExpertAchievement", 6613572652484057095L);
        setLongField(term78720, term78720.getClass(), "totalMasterAchievement", 5215884227381487937L);
        setLongField(term78720, term78720.getClass(), "totalReMasterAchievement", 4350818387294517155L);
        setLongField(term78720, term78720.getClass(), "playerOldRating", 7828337678482028682L);
        setLongField(term78720, term78720.getClass(), "playerNewRating", 5807310433343059132L);
        setIntField(term78720, term78720.getClass(), "banState", 2106340511);
        setLongField(term78720, term78720.getClass(), "dateTime", -6775652378184115310L);
        setField(term78718, term78718.getClass(), "user", term78720);
        setIntField(term78718, term78718.getClass(), "courseId", 1742847722);
        setBooleanField(term78718, term78718.getClass(), "isLastClear", false);
        setIntField(term78718, term78718.getClass(), "totalRestlife", 1423922857);
        setIntField(term78718, term78718.getClass(), "totalAchievement", 1181177739);
        setIntField(term78718, term78718.getClass(), "totalDeluxscore", -1721345168);
        setIntField(term78718, term78718.getClass(), "playCount", -776806272);
        setField(term78718, term78718.getClass(), "clearDate", "vinKDMUJMl");
        setField(term78718, term78718.getClass(), "lastPlayDate", "MgjVPQNbcu");
        setIntField(term78718, term78718.getClass(), "bestAchievement", -495130634);
        setField(term78718, term78718.getClass(), "bestAchievementDate", "QNYLGZGxNy");
        setIntField(term78718, term78718.getClass(), "bestDeluxscore", -1517420629);
        setField(term78718, term78718.getClass(), "bestDeluxscoreDate", "BrECRdedgj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestAchievementDate", argTypes, term78718, args);
    }

};


