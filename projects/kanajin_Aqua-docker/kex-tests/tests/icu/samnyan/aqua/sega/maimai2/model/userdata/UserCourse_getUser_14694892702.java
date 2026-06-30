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

public class UserCourse_getUser_14694892702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72114;

    public UserCourse_getUser_14694892702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72120 = new Long(-4924950707540628022L);
        Integer term72183 = new Integer(-299497261);
        Integer term72185 = new Integer(-23054366);
        Integer term72187 = new Integer(153009426);
        ArrayList term72181 = new ArrayList();
        ((ArrayList) term72181).add(term72183);
        ((ArrayList) term72181).add(term72185);
        ((ArrayList) term72181).add(term72187);
        Integer term72193 = new Integer(185751892);
        Integer term72195 = new Integer(1068256001);
        Integer term72197 = new Integer(1139078354);
        Integer term72199 = new Integer(-691164974);
        Integer term72201 = new Integer(-761675396);
        Integer term72203 = new Integer(-1954860951);
        ArrayList term72191 = new ArrayList();
        ((ArrayList) term72191).add(term72193);
        ((ArrayList) term72191).add(term72195);
        ((ArrayList) term72191).add(term72197);
        ((ArrayList) term72191).add(term72199);
        ((ArrayList) term72191).add(term72201);
        ((ArrayList) term72191).add(term72203);
        term72114 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term72116 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term72118 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72149 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72114, term72114.getClass(), "id", 6025328557132642962L);
        setLongField(term72116, term72116.getClass(), "id", 7776435893105438545L);
        setLongField(term72118, term72118.getClass(), "id", 4661005768418307444L);
        setField(term72118, term72118.getClass(), "extId", term72120);
        setField(term72118, term72118.getClass(), "luid", "BGDjrSZTJY");
        setIntField(term72135, term72135.getClass(), "year", 2020);
        setShortField(term72135, term72135.getClass(), "month", (short) 1);
        setShortField(term72135, term72135.getClass(), "day", (short) 23);
        setField(term72134, term72134.getClass(), "date", term72135);
        setByteField(term72139, term72139.getClass(), "hour", (byte) 17);
        setByteField(term72139, term72139.getClass(), "minute", (byte) 24);
        setByteField(term72139, term72139.getClass(), "second", (byte) 54);
        setIntField(term72139, term72139.getClass(), "nano", 261767355);
        setField(term72134, term72134.getClass(), "time", term72139);
        setField(term72118, term72118.getClass(), "registerTime", term72134);
        setIntField(term72145, term72145.getClass(), "year", 2011);
        setShortField(term72145, term72145.getClass(), "month", (short) 1);
        setShortField(term72145, term72145.getClass(), "day", (short) 20);
        setField(term72144, term72144.getClass(), "date", term72145);
        setByteField(term72149, term72149.getClass(), "hour", (byte) 5);
        setByteField(term72149, term72149.getClass(), "minute", (byte) 23);
        setByteField(term72149, term72149.getClass(), "second", (byte) 54);
        setIntField(term72149, term72149.getClass(), "nano", 4207750);
        setField(term72144, term72144.getClass(), "time", term72149);
        setField(term72118, term72118.getClass(), "accessTime", term72144);
        setField(term72116, term72116.getClass(), "card", term72118);
        setField(term72116, term72116.getClass(), "userName", "VUVCEVItic");
        setIntField(term72116, term72116.getClass(), "isNetMember", 1775132358);
        setIntField(term72116, term72116.getClass(), "iconId", 1425161368);
        setIntField(term72116, term72116.getClass(), "plateId", -340532486);
        setIntField(term72116, term72116.getClass(), "titleId", 1445018453);
        setIntField(term72116, term72116.getClass(), "partnerId", -1201954705);
        setIntField(term72116, term72116.getClass(), "frameId", -339503028);
        setIntField(term72116, term72116.getClass(), "selectMapId", -1432328434);
        setIntField(term72116, term72116.getClass(), "totalAwake", 1166275920);
        setIntField(term72116, term72116.getClass(), "gradeRating", -895238659);
        setIntField(term72116, term72116.getClass(), "musicRating", -1402177219);
        setIntField(term72116, term72116.getClass(), "playerRating", -253998401);
        setIntField(term72116, term72116.getClass(), "highestRating", 325883202);
        setIntField(term72116, term72116.getClass(), "gradeRank", -206493043);
        setIntField(term72116, term72116.getClass(), "classRank", 1965551499);
        setIntField(term72116, term72116.getClass(), "courseRank", -2009375732);
        setField(term72116, term72116.getClass(), "charaSlot", term72181);
        setField(term72116, term72116.getClass(), "charaLockSlot", term72191);
        setLongField(term72116, term72116.getClass(), "contentBit", 1720514282517245063L);
        setIntField(term72116, term72116.getClass(), "playCount", 2023451839);
        setField(term72116, term72116.getClass(), "eventWatchedDate", "tloEDDASGy");
        setField(term72116, term72116.getClass(), "lastGameId", "CQMdMBIICe");
        setField(term72116, term72116.getClass(), "lastRomVersion", "rbJaIkrSnM");
        setField(term72116, term72116.getClass(), "lastDataVersion", "EAKcPFEKbX");
        setField(term72116, term72116.getClass(), "lastLoginDate", "uPdAMNFhdG");
        setField(term72116, term72116.getClass(), "lastPlayDate", "VjXPlvOnMK");
        setIntField(term72116, term72116.getClass(), "lastPlayCredit", 1529272966);
        setIntField(term72116, term72116.getClass(), "lastPlayMode", 1613280223);
        setIntField(term72116, term72116.getClass(), "lastPlaceId", -949788335);
        setField(term72116, term72116.getClass(), "lastPlaceName", "VVfwcKWfYk");
        setIntField(term72116, term72116.getClass(), "lastAllNetId", -606972786);
        setIntField(term72116, term72116.getClass(), "lastRegionId", -764263155);
        setField(term72116, term72116.getClass(), "lastRegionName", "tsYXZxQtLG");
        setField(term72116, term72116.getClass(), "lastClientId", "JUAWRJdehl");
        setField(term72116, term72116.getClass(), "lastCountryCode", "fFslDwqqzQ");
        setIntField(term72116, term72116.getClass(), "lastSelectEMoney", 1713503695);
        setIntField(term72116, term72116.getClass(), "lastSelectTicket", 316488155);
        setIntField(term72116, term72116.getClass(), "lastSelectCourse", 164922289);
        setIntField(term72116, term72116.getClass(), "lastCountCourse", -1214805826);
        setField(term72116, term72116.getClass(), "firstGameId", "oyTybTkTFd");
        setField(term72116, term72116.getClass(), "firstRomVersion", "NNjMZLPIcc");
        setField(term72116, term72116.getClass(), "firstDataVersion", "fAcvTHLHOa");
        setField(term72116, term72116.getClass(), "firstPlayDate", "QavvcNVesW");
        setField(term72116, term72116.getClass(), "compatibleCmVersion", "JmFxhkDeIA");
        setField(term72116, term72116.getClass(), "dailyBonusDate", "XcJqDBnnMZ");
        setField(term72116, term72116.getClass(), "dailyCourseBonusDate", "SchXFoqYFy");
        setField(term72116, term72116.getClass(), "lastPairLoginDate", "MnHKbTZBTr");
        setField(term72116, term72116.getClass(), "lastTrialPlayDate", "xCNDHQZBKx");
        setIntField(term72116, term72116.getClass(), "playVsCount", 1176296583);
        setIntField(term72116, term72116.getClass(), "playSyncCount", 801043391);
        setIntField(term72116, term72116.getClass(), "winCount", 786322082);
        setIntField(term72116, term72116.getClass(), "helpCount", -1051809896);
        setIntField(term72116, term72116.getClass(), "comboCount", -1900546652);
        setLongField(term72116, term72116.getClass(), "totalDeluxscore", -1045336622757351064L);
        setLongField(term72116, term72116.getClass(), "totalBasicDeluxscore", -736341939344099077L);
        setLongField(term72116, term72116.getClass(), "totalAdvancedDeluxscore", -2070593800297942364L);
        setLongField(term72116, term72116.getClass(), "totalExpertDeluxscore", -7023621481714478007L);
        setLongField(term72116, term72116.getClass(), "totalMasterDeluxscore", 4942278370983962653L);
        setLongField(term72116, term72116.getClass(), "totalReMasterDeluxscore", 4497530590028813461L);
        setIntField(term72116, term72116.getClass(), "totalSync", 729869031);
        setIntField(term72116, term72116.getClass(), "totalBasicSync", 79654623);
        setIntField(term72116, term72116.getClass(), "totalAdvancedSync", 539233848);
        setIntField(term72116, term72116.getClass(), "totalExpertSync", -1368797597);
        setIntField(term72116, term72116.getClass(), "totalMasterSync", 2065515885);
        setIntField(term72116, term72116.getClass(), "totalReMasterSync", -765050200);
        setLongField(term72116, term72116.getClass(), "totalAchievement", -3027046249023055574L);
        setLongField(term72116, term72116.getClass(), "totalBasicAchievement", 2253264840516591315L);
        setLongField(term72116, term72116.getClass(), "totalAdvancedAchievement", 7357901219511867751L);
        setLongField(term72116, term72116.getClass(), "totalExpertAchievement", -5944574827460812990L);
        setLongField(term72116, term72116.getClass(), "totalMasterAchievement", -7455884456909857061L);
        setLongField(term72116, term72116.getClass(), "totalReMasterAchievement", 505687838503487032L);
        setLongField(term72116, term72116.getClass(), "playerOldRating", -6352136697288518051L);
        setLongField(term72116, term72116.getClass(), "playerNewRating", -5146908173679489755L);
        setIntField(term72116, term72116.getClass(), "banState", 750639689);
        setLongField(term72116, term72116.getClass(), "dateTime", 2722397189272361522L);
        setField(term72114, term72114.getClass(), "user", term72116);
        setIntField(term72114, term72114.getClass(), "courseId", -281279750);
        setBooleanField(term72114, term72114.getClass(), "isLastClear", false);
        setIntField(term72114, term72114.getClass(), "totalRestlife", 632971563);
        setIntField(term72114, term72114.getClass(), "totalAchievement", 290690311);
        setIntField(term72114, term72114.getClass(), "totalDeluxscore", -1215654854);
        setIntField(term72114, term72114.getClass(), "playCount", -1460137915);
        setField(term72114, term72114.getClass(), "clearDate", "OfXdotjbuM");
        setField(term72114, term72114.getClass(), "lastPlayDate", "DNkENYBesD");
        setIntField(term72114, term72114.getClass(), "bestAchievement", 2048263826);
        setField(term72114, term72114.getClass(), "bestAchievementDate", "TSogTVVlxc");
        setIntField(term72114, term72114.getClass(), "bestDeluxscore", -1353079280);
        setField(term72114, term72114.getClass(), "bestDeluxscoreDate", "kWEJlReukq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term72114, args);
    }

};


