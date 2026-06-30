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

public class UserCourse_setBestAchievementDate_158370240626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88595;

    public UserCourse_setBestAchievementDate_158370240626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88601 = new Long(-7115418542247301000L);
        Integer term88664 = new Integer(1757149811);
        Integer term88666 = new Integer(1505375686);
        Integer term88668 = new Integer(-132005524);
        Integer term88670 = new Integer(-1235127374);
        ArrayList term88662 = new ArrayList();
        ((ArrayList) term88662).add(term88664);
        ((ArrayList) term88662).add(term88666);
        ((ArrayList) term88662).add(term88668);
        ((ArrayList) term88662).add(term88670);
        Integer term88676 = new Integer(-2077814162);
        Integer term88678 = new Integer(444514470);
        Integer term88680 = new Integer(-147055177);
        Integer term88682 = new Integer(1979044375);
        Integer term88684 = new Integer(961252909);
        Integer term88686 = new Integer(1455842357);
        Integer term88688 = new Integer(1349806561);
        Integer term88690 = new Integer(923905351);
        Integer term88692 = new Integer(428360161);
        ArrayList term88674 = new ArrayList();
        ((ArrayList) term88674).add(term88676);
        ((ArrayList) term88674).add(term88678);
        ((ArrayList) term88674).add(term88680);
        ((ArrayList) term88674).add(term88682);
        ((ArrayList) term88674).add(term88684);
        ((ArrayList) term88674).add(term88686);
        ((ArrayList) term88674).add(term88688);
        ((ArrayList) term88674).add(term88690);
        ((ArrayList) term88674).add(term88692);
        term88595 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term88597 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term88599 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88620 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88630 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88595, term88595.getClass(), "id", -677383924825139585L);
        setLongField(term88597, term88597.getClass(), "id", 3676304089995045597L);
        setLongField(term88599, term88599.getClass(), "id", 9176995849424666996L);
        setField(term88599, term88599.getClass(), "extId", term88601);
        setField(term88599, term88599.getClass(), "luid", "pxFICtkwAB");
        setIntField(term88616, term88616.getClass(), "year", 2016);
        setShortField(term88616, term88616.getClass(), "month", (short) 1);
        setShortField(term88616, term88616.getClass(), "day", (short) 24);
        setField(term88615, term88615.getClass(), "date", term88616);
        setByteField(term88620, term88620.getClass(), "hour", (byte) 23);
        setByteField(term88620, term88620.getClass(), "minute", (byte) 15);
        setByteField(term88620, term88620.getClass(), "second", (byte) 43);
        setIntField(term88620, term88620.getClass(), "nano", 860277753);
        setField(term88615, term88615.getClass(), "time", term88620);
        setField(term88599, term88599.getClass(), "registerTime", term88615);
        setIntField(term88626, term88626.getClass(), "year", 2016);
        setShortField(term88626, term88626.getClass(), "month", (short) 2);
        setShortField(term88626, term88626.getClass(), "day", (short) 2);
        setField(term88625, term88625.getClass(), "date", term88626);
        setByteField(term88630, term88630.getClass(), "hour", (byte) 16);
        setByteField(term88630, term88630.getClass(), "minute", (byte) 51);
        setByteField(term88630, term88630.getClass(), "second", (byte) 8);
        setIntField(term88630, term88630.getClass(), "nano", 991355221);
        setField(term88625, term88625.getClass(), "time", term88630);
        setField(term88599, term88599.getClass(), "accessTime", term88625);
        setField(term88597, term88597.getClass(), "card", term88599);
        setField(term88597, term88597.getClass(), "userName", "MrgAxXXbMg");
        setIntField(term88597, term88597.getClass(), "isNetMember", -837360714);
        setIntField(term88597, term88597.getClass(), "iconId", -605017762);
        setIntField(term88597, term88597.getClass(), "plateId", -1606452163);
        setIntField(term88597, term88597.getClass(), "titleId", -1590822439);
        setIntField(term88597, term88597.getClass(), "partnerId", -141055649);
        setIntField(term88597, term88597.getClass(), "frameId", 2045269013);
        setIntField(term88597, term88597.getClass(), "selectMapId", 1260268717);
        setIntField(term88597, term88597.getClass(), "totalAwake", -601011951);
        setIntField(term88597, term88597.getClass(), "gradeRating", 700386109);
        setIntField(term88597, term88597.getClass(), "musicRating", -2030563792);
        setIntField(term88597, term88597.getClass(), "playerRating", 659265799);
        setIntField(term88597, term88597.getClass(), "highestRating", -2000221306);
        setIntField(term88597, term88597.getClass(), "gradeRank", -1480264652);
        setIntField(term88597, term88597.getClass(), "classRank", 950199901);
        setIntField(term88597, term88597.getClass(), "courseRank", -566918920);
        setField(term88597, term88597.getClass(), "charaSlot", term88662);
        setField(term88597, term88597.getClass(), "charaLockSlot", term88674);
        setLongField(term88597, term88597.getClass(), "contentBit", -3212680229932754821L);
        setIntField(term88597, term88597.getClass(), "playCount", -516485250);
        setField(term88597, term88597.getClass(), "eventWatchedDate", "ZmwRRoQNPl");
        setField(term88597, term88597.getClass(), "lastGameId", "prNciwKNKW");
        setField(term88597, term88597.getClass(), "lastRomVersion", "VtfNPRNIuG");
        setField(term88597, term88597.getClass(), "lastDataVersion", "ttqikiUUcN");
        setField(term88597, term88597.getClass(), "lastLoginDate", "NiLxAEvTVO");
        setField(term88597, term88597.getClass(), "lastPlayDate", "SffiObxUZK");
        setIntField(term88597, term88597.getClass(), "lastPlayCredit", -1315484955);
        setIntField(term88597, term88597.getClass(), "lastPlayMode", 1864285170);
        setIntField(term88597, term88597.getClass(), "lastPlaceId", -1621410076);
        setField(term88597, term88597.getClass(), "lastPlaceName", "uzPbXEJVpP");
        setIntField(term88597, term88597.getClass(), "lastAllNetId", -239419301);
        setIntField(term88597, term88597.getClass(), "lastRegionId", 1572833583);
        setField(term88597, term88597.getClass(), "lastRegionName", "vDorZRqjUi");
        setField(term88597, term88597.getClass(), "lastClientId", "pTjttMNuyX");
        setField(term88597, term88597.getClass(), "lastCountryCode", "fFPyzrPhJi");
        setIntField(term88597, term88597.getClass(), "lastSelectEMoney", -404366819);
        setIntField(term88597, term88597.getClass(), "lastSelectTicket", 417600776);
        setIntField(term88597, term88597.getClass(), "lastSelectCourse", -821143832);
        setIntField(term88597, term88597.getClass(), "lastCountCourse", -1416902664);
        setField(term88597, term88597.getClass(), "firstGameId", "tiYwzLkwHD");
        setField(term88597, term88597.getClass(), "firstRomVersion", "vHPMbWTklV");
        setField(term88597, term88597.getClass(), "firstDataVersion", "phgJprcnjd");
        setField(term88597, term88597.getClass(), "firstPlayDate", "RRjrjGfCoC");
        setField(term88597, term88597.getClass(), "compatibleCmVersion", "MzbYanIDmI");
        setField(term88597, term88597.getClass(), "dailyBonusDate", "RYHcwmdSCF");
        setField(term88597, term88597.getClass(), "dailyCourseBonusDate", "PbtJLrRbsa");
        setField(term88597, term88597.getClass(), "lastPairLoginDate", "iiDSRMEZEA");
        setField(term88597, term88597.getClass(), "lastTrialPlayDate", "wBhcQErbFz");
        setIntField(term88597, term88597.getClass(), "playVsCount", -1435299233);
        setIntField(term88597, term88597.getClass(), "playSyncCount", -1100306206);
        setIntField(term88597, term88597.getClass(), "winCount", 68958966);
        setIntField(term88597, term88597.getClass(), "helpCount", 349586221);
        setIntField(term88597, term88597.getClass(), "comboCount", -2038396357);
        setLongField(term88597, term88597.getClass(), "totalDeluxscore", -8974514191774285441L);
        setLongField(term88597, term88597.getClass(), "totalBasicDeluxscore", -4546853968080919834L);
        setLongField(term88597, term88597.getClass(), "totalAdvancedDeluxscore", 1281872419462997592L);
        setLongField(term88597, term88597.getClass(), "totalExpertDeluxscore", -700098407024972610L);
        setLongField(term88597, term88597.getClass(), "totalMasterDeluxscore", 8346130120381478068L);
        setLongField(term88597, term88597.getClass(), "totalReMasterDeluxscore", -2325777595445399907L);
        setIntField(term88597, term88597.getClass(), "totalSync", -1334161201);
        setIntField(term88597, term88597.getClass(), "totalBasicSync", -2125960665);
        setIntField(term88597, term88597.getClass(), "totalAdvancedSync", -755852794);
        setIntField(term88597, term88597.getClass(), "totalExpertSync", -881250262);
        setIntField(term88597, term88597.getClass(), "totalMasterSync", 803280886);
        setIntField(term88597, term88597.getClass(), "totalReMasterSync", -1274349559);
        setLongField(term88597, term88597.getClass(), "totalAchievement", -3514785447628222010L);
        setLongField(term88597, term88597.getClass(), "totalBasicAchievement", -5108468977208772556L);
        setLongField(term88597, term88597.getClass(), "totalAdvancedAchievement", 505876240564658953L);
        setLongField(term88597, term88597.getClass(), "totalExpertAchievement", 7742764755721559987L);
        setLongField(term88597, term88597.getClass(), "totalMasterAchievement", -8991703742842083780L);
        setLongField(term88597, term88597.getClass(), "totalReMasterAchievement", 5615941840917152622L);
        setLongField(term88597, term88597.getClass(), "playerOldRating", -4465594170502445650L);
        setLongField(term88597, term88597.getClass(), "playerNewRating", -8090024033686339139L);
        setIntField(term88597, term88597.getClass(), "banState", 620253070);
        setLongField(term88597, term88597.getClass(), "dateTime", 2068874593380068539L);
        setField(term88595, term88595.getClass(), "user", term88597);
        setIntField(term88595, term88595.getClass(), "courseId", 391646161);
        setBooleanField(term88595, term88595.getClass(), "isLastClear", false);
        setIntField(term88595, term88595.getClass(), "totalRestlife", 1556323428);
        setIntField(term88595, term88595.getClass(), "totalAchievement", -1121322138);
        setIntField(term88595, term88595.getClass(), "totalDeluxscore", 320229218);
        setIntField(term88595, term88595.getClass(), "playCount", -416293515);
        setField(term88595, term88595.getClass(), "clearDate", "iJLzZkhOlH");
        setField(term88595, term88595.getClass(), "lastPlayDate", "GUDWKmTIil");
        setIntField(term88595, term88595.getClass(), "bestAchievement", 814623608);
        setField(term88595, term88595.getClass(), "bestAchievementDate", "hZnzaYDeRe");
        setIntField(term88595, term88595.getClass(), "bestDeluxscore", 1611955417);
        setField(term88595, term88595.getClass(), "bestDeluxscoreDate", "TbzRSKYwZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IMobeYICFK";
        callMethod(klass, "setBestAchievementDate", argTypes, term88595, args);
    }

};


