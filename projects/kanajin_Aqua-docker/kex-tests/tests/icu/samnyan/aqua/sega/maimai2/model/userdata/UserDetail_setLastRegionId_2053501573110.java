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

public class UserDetail_setLastRegionId_2053501573110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4292161;
     Object term4292524;

    public UserDetail_setLastRegionId_2053501573110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4292165 = new Long(-7418127502854503493L);
        Integer term4292228 = new Integer(-1413405889);
        Integer term4292230 = new Integer(351830399);
        Integer term4292232 = new Integer(-398403935);
        Integer term4292234 = new Integer(-1098793577);
        Integer term4292236 = new Integer(937901039);
        Integer term4292238 = new Integer(729310767);
        Integer term4292240 = new Integer(-517546330);
        Integer term4292242 = new Integer(-1850791590);
        Integer term4292244 = new Integer(-1853602802);
        ArrayList term4292226 = new ArrayList();
        ((ArrayList) term4292226).add(term4292228);
        ((ArrayList) term4292226).add(term4292230);
        ((ArrayList) term4292226).add(term4292232);
        ((ArrayList) term4292226).add(term4292234);
        ((ArrayList) term4292226).add(term4292236);
        ((ArrayList) term4292226).add(term4292238);
        ((ArrayList) term4292226).add(term4292240);
        ((ArrayList) term4292226).add(term4292242);
        ((ArrayList) term4292226).add(term4292244);
        Integer term4292250 = new Integer(1418314493);
        Integer term4292252 = new Integer(-232598231);
        Integer term4292254 = new Integer(-1780188367);
        ArrayList term4292248 = new ArrayList();
        ((ArrayList) term4292248).add(term4292250);
        ((ArrayList) term4292248).add(term4292252);
        ((ArrayList) term4292248).add(term4292254);
        term4292161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4292163 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4292179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4292180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4292184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4292189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4292190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4292194 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4292161, term4292161.getClass(), "id", 7891613930555581461L);
        setLongField(term4292163, term4292163.getClass(), "id", 3971201944098504249L);
        setField(term4292163, term4292163.getClass(), "extId", term4292165);
        setField(term4292163, term4292163.getClass(), "luid", "tmRqUmflxk");
        setIntField(term4292180, term4292180.getClass(), "year", 2023);
        setShortField(term4292180, term4292180.getClass(), "month", (short) 8);
        setShortField(term4292180, term4292180.getClass(), "day", (short) 5);
        setField(term4292179, term4292179.getClass(), "date", term4292180);
        setByteField(term4292184, term4292184.getClass(), "hour", (byte) 17);
        setByteField(term4292184, term4292184.getClass(), "minute", (byte) 8);
        setByteField(term4292184, term4292184.getClass(), "second", (byte) 11);
        setIntField(term4292184, term4292184.getClass(), "nano", 121390297);
        setField(term4292179, term4292179.getClass(), "time", term4292184);
        setField(term4292163, term4292163.getClass(), "registerTime", term4292179);
        setIntField(term4292190, term4292190.getClass(), "year", 2017);
        setShortField(term4292190, term4292190.getClass(), "month", (short) 12);
        setShortField(term4292190, term4292190.getClass(), "day", (short) 4);
        setField(term4292189, term4292189.getClass(), "date", term4292190);
        setByteField(term4292194, term4292194.getClass(), "hour", (byte) 2);
        setByteField(term4292194, term4292194.getClass(), "minute", (byte) 2);
        setByteField(term4292194, term4292194.getClass(), "second", (byte) 0);
        setIntField(term4292194, term4292194.getClass(), "nano", 758221097);
        setField(term4292189, term4292189.getClass(), "time", term4292194);
        setField(term4292163, term4292163.getClass(), "accessTime", term4292189);
        setField(term4292161, term4292161.getClass(), "card", term4292163);
        setField(term4292161, term4292161.getClass(), "userName", "SjRxoRNNIS");
        setIntField(term4292161, term4292161.getClass(), "isNetMember", -92225106);
        setIntField(term4292161, term4292161.getClass(), "iconId", -2010838008);
        setIntField(term4292161, term4292161.getClass(), "plateId", -756206599);
        setIntField(term4292161, term4292161.getClass(), "titleId", 244800618);
        setIntField(term4292161, term4292161.getClass(), "partnerId", 2065909676);
        setIntField(term4292161, term4292161.getClass(), "frameId", 106582482);
        setIntField(term4292161, term4292161.getClass(), "selectMapId", 63992111);
        setIntField(term4292161, term4292161.getClass(), "totalAwake", 1158896850);
        setIntField(term4292161, term4292161.getClass(), "gradeRating", -2065662903);
        setIntField(term4292161, term4292161.getClass(), "musicRating", 549157823);
        setIntField(term4292161, term4292161.getClass(), "playerRating", 1938563492);
        setIntField(term4292161, term4292161.getClass(), "highestRating", -2117202930);
        setIntField(term4292161, term4292161.getClass(), "gradeRank", 1481096322);
        setIntField(term4292161, term4292161.getClass(), "classRank", 1486234402);
        setIntField(term4292161, term4292161.getClass(), "courseRank", 2084621125);
        setField(term4292161, term4292161.getClass(), "charaSlot", term4292226);
        setField(term4292161, term4292161.getClass(), "charaLockSlot", term4292248);
        setLongField(term4292161, term4292161.getClass(), "contentBit", 5151865570899174652L);
        setIntField(term4292161, term4292161.getClass(), "playCount", -81000428);
        setField(term4292161, term4292161.getClass(), "eventWatchedDate", "YKgNvgSfuR");
        setField(term4292161, term4292161.getClass(), "lastGameId", "hjqSLePboP");
        setField(term4292161, term4292161.getClass(), "lastRomVersion", "DpJnwVOfLm");
        setField(term4292161, term4292161.getClass(), "lastDataVersion", "BKmINTBjrg");
        setField(term4292161, term4292161.getClass(), "lastLoginDate", "COBcWZFUMX");
        setField(term4292161, term4292161.getClass(), "lastPlayDate", "VkxzFKShEM");
        setIntField(term4292161, term4292161.getClass(), "lastPlayCredit", -1229403742);
        setIntField(term4292161, term4292161.getClass(), "lastPlayMode", 400168774);
        setIntField(term4292161, term4292161.getClass(), "lastPlaceId", -1425337912);
        setField(term4292161, term4292161.getClass(), "lastPlaceName", "vAhqAjqAmA");
        setIntField(term4292161, term4292161.getClass(), "lastAllNetId", -1108493889);
        setIntField(term4292161, term4292161.getClass(), "lastRegionId", -1283630655);
        setField(term4292161, term4292161.getClass(), "lastRegionName", "XWPmCjTjjj");
        setField(term4292161, term4292161.getClass(), "lastClientId", "oGATVoKsnC");
        setField(term4292161, term4292161.getClass(), "lastCountryCode", "qYwvCWOvge");
        setIntField(term4292161, term4292161.getClass(), "lastSelectEMoney", 1652719007);
        setIntField(term4292161, term4292161.getClass(), "lastSelectTicket", -2069551924);
        setIntField(term4292161, term4292161.getClass(), "lastSelectCourse", 806326826);
        setIntField(term4292161, term4292161.getClass(), "lastCountCourse", 1171041421);
        setField(term4292161, term4292161.getClass(), "firstGameId", "RSKMhIdmGv");
        setField(term4292161, term4292161.getClass(), "firstRomVersion", "FxlgNVcYoU");
        setField(term4292161, term4292161.getClass(), "firstDataVersion", "PKrwUJhaQc");
        setField(term4292161, term4292161.getClass(), "firstPlayDate", "GIaGsEskBn");
        setField(term4292161, term4292161.getClass(), "compatibleCmVersion", "KSistRQxNE");
        setField(term4292161, term4292161.getClass(), "dailyBonusDate", "DkuDnvkxSa");
        setField(term4292161, term4292161.getClass(), "dailyCourseBonusDate", "SmMefDdQsW");
        setField(term4292161, term4292161.getClass(), "lastPairLoginDate", "XFlvEpPtmb");
        setField(term4292161, term4292161.getClass(), "lastTrialPlayDate", "GYaehnrRjh");
        setIntField(term4292161, term4292161.getClass(), "playVsCount", 1450459458);
        setIntField(term4292161, term4292161.getClass(), "playSyncCount", 640576574);
        setIntField(term4292161, term4292161.getClass(), "winCount", -1897903807);
        setIntField(term4292161, term4292161.getClass(), "helpCount", -51566516);
        setIntField(term4292161, term4292161.getClass(), "comboCount", 1217365398);
        setLongField(term4292161, term4292161.getClass(), "totalDeluxscore", -6747840001682605919L);
        setLongField(term4292161, term4292161.getClass(), "totalBasicDeluxscore", 9093504694059266054L);
        setLongField(term4292161, term4292161.getClass(), "totalAdvancedDeluxscore", 5328603328194904250L);
        setLongField(term4292161, term4292161.getClass(), "totalExpertDeluxscore", 5104228347980177208L);
        setLongField(term4292161, term4292161.getClass(), "totalMasterDeluxscore", 2696478180784723267L);
        setLongField(term4292161, term4292161.getClass(), "totalReMasterDeluxscore", -2242756702859746693L);
        setIntField(term4292161, term4292161.getClass(), "totalSync", 680990463);
        setIntField(term4292161, term4292161.getClass(), "totalBasicSync", 488894868);
        setIntField(term4292161, term4292161.getClass(), "totalAdvancedSync", 1214530337);
        setIntField(term4292161, term4292161.getClass(), "totalExpertSync", -1889988533);
        setIntField(term4292161, term4292161.getClass(), "totalMasterSync", 1692626883);
        setIntField(term4292161, term4292161.getClass(), "totalReMasterSync", 741602670);
        setLongField(term4292161, term4292161.getClass(), "totalAchievement", -1603318221323527260L);
        setLongField(term4292161, term4292161.getClass(), "totalBasicAchievement", 1377139250575841078L);
        setLongField(term4292161, term4292161.getClass(), "totalAdvancedAchievement", -8484883661242484177L);
        setLongField(term4292161, term4292161.getClass(), "totalExpertAchievement", 4433030509781513785L);
        setLongField(term4292161, term4292161.getClass(), "totalMasterAchievement", 4984604763404112552L);
        setLongField(term4292161, term4292161.getClass(), "totalReMasterAchievement", 7949759597777058780L);
        setLongField(term4292161, term4292161.getClass(), "playerOldRating", 5395747702188663047L);
        setLongField(term4292161, term4292161.getClass(), "playerNewRating", 5030435964398235239L);
        setIntField(term4292161, term4292161.getClass(), "banState", -1100661619);
        setLongField(term4292161, term4292161.getClass(), "dateTime", 8693610265019990651L);
        term4292524 = new Integer(2021383819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4292524;
        callMethod(klass, "setLastRegionId", argTypes, term4292161, args);
    }

};


