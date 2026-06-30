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

public class UserCourse_setBestDeluxscoreDate_148571143128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89959;

    public UserCourse_setBestDeluxscoreDate_148571143128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89965 = new Long(-2924531382671518368L);
        Integer term90028 = new Integer(522440332);
        Integer term90030 = new Integer(1516598327);
        Integer term90032 = new Integer(82353584);
        Integer term90034 = new Integer(-758778797);
        ArrayList term90026 = new ArrayList();
        ((ArrayList) term90026).add(term90028);
        ((ArrayList) term90026).add(term90030);
        ((ArrayList) term90026).add(term90032);
        ((ArrayList) term90026).add(term90034);
        Integer term90040 = new Integer(765680355);
        Integer term90042 = new Integer(-1012090049);
        Integer term90044 = new Integer(-2025214553);
        Integer term90046 = new Integer(-154750730);
        Integer term90048 = new Integer(-2047179134);
        ArrayList term90038 = new ArrayList();
        ((ArrayList) term90038).add(term90040);
        ((ArrayList) term90038).add(term90042);
        ((ArrayList) term90038).add(term90044);
        ((ArrayList) term90038).add(term90046);
        ((ArrayList) term90038).add(term90048);
        term89959 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term89961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term89963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89959, term89959.getClass(), "id", 6673648627982640630L);
        setLongField(term89961, term89961.getClass(), "id", -4710542328870024553L);
        setLongField(term89963, term89963.getClass(), "id", 711490618640696795L);
        setField(term89963, term89963.getClass(), "extId", term89965);
        setField(term89963, term89963.getClass(), "luid", "SRphuuiFTJ");
        setIntField(term89980, term89980.getClass(), "year", 2010);
        setShortField(term89980, term89980.getClass(), "month", (short) 11);
        setShortField(term89980, term89980.getClass(), "day", (short) 14);
        setField(term89979, term89979.getClass(), "date", term89980);
        setByteField(term89984, term89984.getClass(), "hour", (byte) 4);
        setByteField(term89984, term89984.getClass(), "minute", (byte) 49);
        setByteField(term89984, term89984.getClass(), "second", (byte) 50);
        setIntField(term89984, term89984.getClass(), "nano", 621399921);
        setField(term89979, term89979.getClass(), "time", term89984);
        setField(term89963, term89963.getClass(), "registerTime", term89979);
        setIntField(term89990, term89990.getClass(), "year", 2027);
        setShortField(term89990, term89990.getClass(), "month", (short) 1);
        setShortField(term89990, term89990.getClass(), "day", (short) 20);
        setField(term89989, term89989.getClass(), "date", term89990);
        setByteField(term89994, term89994.getClass(), "hour", (byte) 8);
        setByteField(term89994, term89994.getClass(), "minute", (byte) 5);
        setByteField(term89994, term89994.getClass(), "second", (byte) 44);
        setIntField(term89994, term89994.getClass(), "nano", 960768267);
        setField(term89989, term89989.getClass(), "time", term89994);
        setField(term89963, term89963.getClass(), "accessTime", term89989);
        setField(term89961, term89961.getClass(), "card", term89963);
        setField(term89961, term89961.getClass(), "userName", "SLJslBhpEj");
        setIntField(term89961, term89961.getClass(), "isNetMember", -50653203);
        setIntField(term89961, term89961.getClass(), "iconId", 771255311);
        setIntField(term89961, term89961.getClass(), "plateId", -1063550375);
        setIntField(term89961, term89961.getClass(), "titleId", 416754757);
        setIntField(term89961, term89961.getClass(), "partnerId", -878383495);
        setIntField(term89961, term89961.getClass(), "frameId", -1333087297);
        setIntField(term89961, term89961.getClass(), "selectMapId", 855437401);
        setIntField(term89961, term89961.getClass(), "totalAwake", 929964148);
        setIntField(term89961, term89961.getClass(), "gradeRating", 1226042578);
        setIntField(term89961, term89961.getClass(), "musicRating", 1894178312);
        setIntField(term89961, term89961.getClass(), "playerRating", 1804953221);
        setIntField(term89961, term89961.getClass(), "highestRating", -1246078900);
        setIntField(term89961, term89961.getClass(), "gradeRank", 488994033);
        setIntField(term89961, term89961.getClass(), "classRank", 1059681981);
        setIntField(term89961, term89961.getClass(), "courseRank", 1611223068);
        setField(term89961, term89961.getClass(), "charaSlot", term90026);
        setField(term89961, term89961.getClass(), "charaLockSlot", term90038);
        setLongField(term89961, term89961.getClass(), "contentBit", -8939684594399095164L);
        setIntField(term89961, term89961.getClass(), "playCount", 1902439631);
        setField(term89961, term89961.getClass(), "eventWatchedDate", "BkSzKYsyMt");
        setField(term89961, term89961.getClass(), "lastGameId", "BehEjNaXVK");
        setField(term89961, term89961.getClass(), "lastRomVersion", "TrunCyrewP");
        setField(term89961, term89961.getClass(), "lastDataVersion", "NGQmiHNyCj");
        setField(term89961, term89961.getClass(), "lastLoginDate", "fJerFGYlGC");
        setField(term89961, term89961.getClass(), "lastPlayDate", "CvltyVwJfx");
        setIntField(term89961, term89961.getClass(), "lastPlayCredit", -18255187);
        setIntField(term89961, term89961.getClass(), "lastPlayMode", -1088335552);
        setIntField(term89961, term89961.getClass(), "lastPlaceId", -405643924);
        setField(term89961, term89961.getClass(), "lastPlaceName", "aKQcZIBmMO");
        setIntField(term89961, term89961.getClass(), "lastAllNetId", -312877355);
        setIntField(term89961, term89961.getClass(), "lastRegionId", -1575759244);
        setField(term89961, term89961.getClass(), "lastRegionName", "izEIjACTdh");
        setField(term89961, term89961.getClass(), "lastClientId", "FBpdKznMSt");
        setField(term89961, term89961.getClass(), "lastCountryCode", "LCjhPHXcwj");
        setIntField(term89961, term89961.getClass(), "lastSelectEMoney", -130757852);
        setIntField(term89961, term89961.getClass(), "lastSelectTicket", -1578353749);
        setIntField(term89961, term89961.getClass(), "lastSelectCourse", -1729440681);
        setIntField(term89961, term89961.getClass(), "lastCountCourse", -1451086024);
        setField(term89961, term89961.getClass(), "firstGameId", "inoNzxBFDa");
        setField(term89961, term89961.getClass(), "firstRomVersion", "dFDHlXwhMk");
        setField(term89961, term89961.getClass(), "firstDataVersion", "AUMXeSohOi");
        setField(term89961, term89961.getClass(), "firstPlayDate", "HjZSMjBIEl");
        setField(term89961, term89961.getClass(), "compatibleCmVersion", "SQQNAxPlwz");
        setField(term89961, term89961.getClass(), "dailyBonusDate", "AoOgJDNbaF");
        setField(term89961, term89961.getClass(), "dailyCourseBonusDate", "PoxurfXwit");
        setField(term89961, term89961.getClass(), "lastPairLoginDate", "fhKxidKBbV");
        setField(term89961, term89961.getClass(), "lastTrialPlayDate", "SIJmlwIkel");
        setIntField(term89961, term89961.getClass(), "playVsCount", -1484385005);
        setIntField(term89961, term89961.getClass(), "playSyncCount", 1911846407);
        setIntField(term89961, term89961.getClass(), "winCount", -1861622294);
        setIntField(term89961, term89961.getClass(), "helpCount", -1348867162);
        setIntField(term89961, term89961.getClass(), "comboCount", -1365727758);
        setLongField(term89961, term89961.getClass(), "totalDeluxscore", -7748613109503374943L);
        setLongField(term89961, term89961.getClass(), "totalBasicDeluxscore", -8647371121395122436L);
        setLongField(term89961, term89961.getClass(), "totalAdvancedDeluxscore", -7377577718146705627L);
        setLongField(term89961, term89961.getClass(), "totalExpertDeluxscore", -4742652737531811018L);
        setLongField(term89961, term89961.getClass(), "totalMasterDeluxscore", 7714939142473649868L);
        setLongField(term89961, term89961.getClass(), "totalReMasterDeluxscore", -1207137470414072121L);
        setIntField(term89961, term89961.getClass(), "totalSync", -1623272453);
        setIntField(term89961, term89961.getClass(), "totalBasicSync", -165330808);
        setIntField(term89961, term89961.getClass(), "totalAdvancedSync", 1087515293);
        setIntField(term89961, term89961.getClass(), "totalExpertSync", 1480080450);
        setIntField(term89961, term89961.getClass(), "totalMasterSync", -1230976797);
        setIntField(term89961, term89961.getClass(), "totalReMasterSync", 175415190);
        setLongField(term89961, term89961.getClass(), "totalAchievement", -3430555142569753657L);
        setLongField(term89961, term89961.getClass(), "totalBasicAchievement", -5740116915366900340L);
        setLongField(term89961, term89961.getClass(), "totalAdvancedAchievement", 4535342579444446360L);
        setLongField(term89961, term89961.getClass(), "totalExpertAchievement", -1616865027789487667L);
        setLongField(term89961, term89961.getClass(), "totalMasterAchievement", 2204129642286303189L);
        setLongField(term89961, term89961.getClass(), "totalReMasterAchievement", -7650346959035604834L);
        setLongField(term89961, term89961.getClass(), "playerOldRating", 8872844183222227244L);
        setLongField(term89961, term89961.getClass(), "playerNewRating", 870803540234717320L);
        setIntField(term89961, term89961.getClass(), "banState", 1375754973);
        setLongField(term89961, term89961.getClass(), "dateTime", -5928376730962730330L);
        setField(term89959, term89959.getClass(), "user", term89961);
        setIntField(term89959, term89959.getClass(), "courseId", 1585713609);
        setBooleanField(term89959, term89959.getClass(), "isLastClear", true);
        setIntField(term89959, term89959.getClass(), "totalRestlife", 13355218);
        setIntField(term89959, term89959.getClass(), "totalAchievement", -904535263);
        setIntField(term89959, term89959.getClass(), "totalDeluxscore", 842353151);
        setIntField(term89959, term89959.getClass(), "playCount", -1777916559);
        setField(term89959, term89959.getClass(), "clearDate", "lqucbHOiHE");
        setField(term89959, term89959.getClass(), "lastPlayDate", "AtnEadrVWF");
        setIntField(term89959, term89959.getClass(), "bestAchievement", 70751907);
        setField(term89959, term89959.getClass(), "bestAchievementDate", "YghxvBBBOW");
        setIntField(term89959, term89959.getClass(), "bestDeluxscore", 275138155);
        setField(term89959, term89959.getClass(), "bestDeluxscoreDate", "LHuytJdqwq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SqSvcPPMTC";
        callMethod(klass, "setBestDeluxscoreDate", argTypes, term89959, args);
    }

};


