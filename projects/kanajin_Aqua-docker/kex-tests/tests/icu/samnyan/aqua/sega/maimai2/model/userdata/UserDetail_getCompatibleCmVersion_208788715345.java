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

public class UserDetail_getCompatibleCmVersion_208788715345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4255011;

    public UserDetail_getCompatibleCmVersion_208788715345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4255015 = new Long(7427943646966776961L);
        Integer term4255078 = new Integer(-1170623459);
        Integer term4255080 = new Integer(1449993114);
        ArrayList term4255076 = new ArrayList();
        ((ArrayList) term4255076).add(term4255078);
        ((ArrayList) term4255076).add(term4255080);
        Integer term4255086 = new Integer(-734393320);
        Integer term4255088 = new Integer(-345557283);
        Integer term4255090 = new Integer(156448167);
        Integer term4255092 = new Integer(-1594914286);
        Integer term4255094 = new Integer(-1101748725);
        Integer term4255096 = new Integer(1729452900);
        Integer term4255098 = new Integer(1494418561);
        Integer term4255100 = new Integer(1872045675);
        ArrayList term4255084 = new ArrayList();
        ((ArrayList) term4255084).add(term4255086);
        ((ArrayList) term4255084).add(term4255088);
        ((ArrayList) term4255084).add(term4255090);
        ((ArrayList) term4255084).add(term4255092);
        ((ArrayList) term4255084).add(term4255094);
        ((ArrayList) term4255084).add(term4255096);
        ((ArrayList) term4255084).add(term4255098);
        ((ArrayList) term4255084).add(term4255100);
        term4255011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4255013 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4255029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4255030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4255034 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4255039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4255040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4255044 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4255011, term4255011.getClass(), "id", -7685848009937149049L);
        setLongField(term4255013, term4255013.getClass(), "id", -8401230785486199059L);
        setField(term4255013, term4255013.getClass(), "extId", term4255015);
        setField(term4255013, term4255013.getClass(), "luid", "VZQtvlgWRP");
        setIntField(term4255030, term4255030.getClass(), "year", 2019);
        setShortField(term4255030, term4255030.getClass(), "month", (short) 6);
        setShortField(term4255030, term4255030.getClass(), "day", (short) 26);
        setField(term4255029, term4255029.getClass(), "date", term4255030);
        setByteField(term4255034, term4255034.getClass(), "hour", (byte) 22);
        setByteField(term4255034, term4255034.getClass(), "minute", (byte) 44);
        setByteField(term4255034, term4255034.getClass(), "second", (byte) 8);
        setIntField(term4255034, term4255034.getClass(), "nano", 235674721);
        setField(term4255029, term4255029.getClass(), "time", term4255034);
        setField(term4255013, term4255013.getClass(), "registerTime", term4255029);
        setIntField(term4255040, term4255040.getClass(), "year", 2016);
        setShortField(term4255040, term4255040.getClass(), "month", (short) 5);
        setShortField(term4255040, term4255040.getClass(), "day", (short) 3);
        setField(term4255039, term4255039.getClass(), "date", term4255040);
        setByteField(term4255044, term4255044.getClass(), "hour", (byte) 11);
        setByteField(term4255044, term4255044.getClass(), "minute", (byte) 41);
        setByteField(term4255044, term4255044.getClass(), "second", (byte) 14);
        setIntField(term4255044, term4255044.getClass(), "nano", 880476516);
        setField(term4255039, term4255039.getClass(), "time", term4255044);
        setField(term4255013, term4255013.getClass(), "accessTime", term4255039);
        setField(term4255011, term4255011.getClass(), "card", term4255013);
        setField(term4255011, term4255011.getClass(), "userName", "XjjpLBrySY");
        setIntField(term4255011, term4255011.getClass(), "isNetMember", 1958990460);
        setIntField(term4255011, term4255011.getClass(), "iconId", -1810448042);
        setIntField(term4255011, term4255011.getClass(), "plateId", -784000477);
        setIntField(term4255011, term4255011.getClass(), "titleId", -683939667);
        setIntField(term4255011, term4255011.getClass(), "partnerId", -928506280);
        setIntField(term4255011, term4255011.getClass(), "frameId", -1842140143);
        setIntField(term4255011, term4255011.getClass(), "selectMapId", -475383893);
        setIntField(term4255011, term4255011.getClass(), "totalAwake", -1834544628);
        setIntField(term4255011, term4255011.getClass(), "gradeRating", 1254161578);
        setIntField(term4255011, term4255011.getClass(), "musicRating", -858584795);
        setIntField(term4255011, term4255011.getClass(), "playerRating", -1451822413);
        setIntField(term4255011, term4255011.getClass(), "highestRating", -1938608829);
        setIntField(term4255011, term4255011.getClass(), "gradeRank", -1293667179);
        setIntField(term4255011, term4255011.getClass(), "classRank", -1133649069);
        setIntField(term4255011, term4255011.getClass(), "courseRank", 588835898);
        setField(term4255011, term4255011.getClass(), "charaSlot", term4255076);
        setField(term4255011, term4255011.getClass(), "charaLockSlot", term4255084);
        setLongField(term4255011, term4255011.getClass(), "contentBit", 5812236754408201077L);
        setIntField(term4255011, term4255011.getClass(), "playCount", 1920283354);
        setField(term4255011, term4255011.getClass(), "eventWatchedDate", "QunPvgCYPh");
        setField(term4255011, term4255011.getClass(), "lastGameId", "bMvXSuyaHT");
        setField(term4255011, term4255011.getClass(), "lastRomVersion", "PgytDXKlhe");
        setField(term4255011, term4255011.getClass(), "lastDataVersion", "kIMdNWcXIK");
        setField(term4255011, term4255011.getClass(), "lastLoginDate", "bznyqHFqNw");
        setField(term4255011, term4255011.getClass(), "lastPlayDate", "KNTqOdXhsX");
        setIntField(term4255011, term4255011.getClass(), "lastPlayCredit", 1574318589);
        setIntField(term4255011, term4255011.getClass(), "lastPlayMode", -1223659152);
        setIntField(term4255011, term4255011.getClass(), "lastPlaceId", 558283611);
        setField(term4255011, term4255011.getClass(), "lastPlaceName", "lKUaFXwEsK");
        setIntField(term4255011, term4255011.getClass(), "lastAllNetId", 1828846118);
        setIntField(term4255011, term4255011.getClass(), "lastRegionId", 882740245);
        setField(term4255011, term4255011.getClass(), "lastRegionName", "BMshMMdjbb");
        setField(term4255011, term4255011.getClass(), "lastClientId", "pYzcgyYVDE");
        setField(term4255011, term4255011.getClass(), "lastCountryCode", "GGDIyKzZpN");
        setIntField(term4255011, term4255011.getClass(), "lastSelectEMoney", -498738325);
        setIntField(term4255011, term4255011.getClass(), "lastSelectTicket", -251402234);
        setIntField(term4255011, term4255011.getClass(), "lastSelectCourse", 634236911);
        setIntField(term4255011, term4255011.getClass(), "lastCountCourse", -177217226);
        setField(term4255011, term4255011.getClass(), "firstGameId", "nlZNTjciQZ");
        setField(term4255011, term4255011.getClass(), "firstRomVersion", "HgZFPHKpgj");
        setField(term4255011, term4255011.getClass(), "firstDataVersion", "uXkEYqjNSv");
        setField(term4255011, term4255011.getClass(), "firstPlayDate", "eMRIIhweBc");
        setField(term4255011, term4255011.getClass(), "compatibleCmVersion", "HAaGTwqUNN");
        setField(term4255011, term4255011.getClass(), "dailyBonusDate", "ZqBHqzTeeG");
        setField(term4255011, term4255011.getClass(), "dailyCourseBonusDate", "FEcSGLzISC");
        setField(term4255011, term4255011.getClass(), "lastPairLoginDate", "thOzOjYUsZ");
        setField(term4255011, term4255011.getClass(), "lastTrialPlayDate", "SMTiETUsDO");
        setIntField(term4255011, term4255011.getClass(), "playVsCount", -1931359347);
        setIntField(term4255011, term4255011.getClass(), "playSyncCount", 81616114);
        setIntField(term4255011, term4255011.getClass(), "winCount", -906390703);
        setIntField(term4255011, term4255011.getClass(), "helpCount", 1164975090);
        setIntField(term4255011, term4255011.getClass(), "comboCount", -1249652733);
        setLongField(term4255011, term4255011.getClass(), "totalDeluxscore", 3040747343523062640L);
        setLongField(term4255011, term4255011.getClass(), "totalBasicDeluxscore", 5761023800686831689L);
        setLongField(term4255011, term4255011.getClass(), "totalAdvancedDeluxscore", 6452714935475751849L);
        setLongField(term4255011, term4255011.getClass(), "totalExpertDeluxscore", -7383298149454242176L);
        setLongField(term4255011, term4255011.getClass(), "totalMasterDeluxscore", -941211785336103264L);
        setLongField(term4255011, term4255011.getClass(), "totalReMasterDeluxscore", -3603719988840640558L);
        setIntField(term4255011, term4255011.getClass(), "totalSync", -1574533934);
        setIntField(term4255011, term4255011.getClass(), "totalBasicSync", -1186587417);
        setIntField(term4255011, term4255011.getClass(), "totalAdvancedSync", -1520208535);
        setIntField(term4255011, term4255011.getClass(), "totalExpertSync", -651112295);
        setIntField(term4255011, term4255011.getClass(), "totalMasterSync", 1087276742);
        setIntField(term4255011, term4255011.getClass(), "totalReMasterSync", 991818789);
        setLongField(term4255011, term4255011.getClass(), "totalAchievement", -5102177498848849010L);
        setLongField(term4255011, term4255011.getClass(), "totalBasicAchievement", -1222992398788461897L);
        setLongField(term4255011, term4255011.getClass(), "totalAdvancedAchievement", 4987539943788609291L);
        setLongField(term4255011, term4255011.getClass(), "totalExpertAchievement", 8292599303049342508L);
        setLongField(term4255011, term4255011.getClass(), "totalMasterAchievement", -3633929635772668310L);
        setLongField(term4255011, term4255011.getClass(), "totalReMasterAchievement", 8983290626569430454L);
        setLongField(term4255011, term4255011.getClass(), "playerOldRating", 5187618031912707427L);
        setLongField(term4255011, term4255011.getClass(), "playerNewRating", 8824134216452923815L);
        setIntField(term4255011, term4255011.getClass(), "banState", 1342425306);
        setLongField(term4255011, term4255011.getClass(), "dateTime", 8629582366272539123L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term4255011, args);
    }

};


