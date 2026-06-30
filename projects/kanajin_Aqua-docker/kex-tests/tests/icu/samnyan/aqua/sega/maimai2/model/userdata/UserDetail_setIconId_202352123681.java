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

public class UserDetail_setIconId_202352123681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4275491;
     Object term4275850;

    public UserDetail_setIconId_202352123681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4275495 = new Long(-6356470816180664936L);
        Integer term4275558 = new Integer(-1587031240);
        Integer term4275560 = new Integer(-1989664257);
        Integer term4275562 = new Integer(-1910664616);
        Integer term4275564 = new Integer(487482309);
        Integer term4275566 = new Integer(-579808690);
        Integer term4275568 = new Integer(-1713470455);
        Integer term4275570 = new Integer(216514040);
        Integer term4275572 = new Integer(1192613481);
        Integer term4275574 = new Integer(-904848351);
        ArrayList term4275556 = new ArrayList();
        ((ArrayList) term4275556).add(term4275558);
        ((ArrayList) term4275556).add(term4275560);
        ((ArrayList) term4275556).add(term4275562);
        ((ArrayList) term4275556).add(term4275564);
        ((ArrayList) term4275556).add(term4275566);
        ((ArrayList) term4275556).add(term4275568);
        ((ArrayList) term4275556).add(term4275570);
        ((ArrayList) term4275556).add(term4275572);
        ((ArrayList) term4275556).add(term4275574);
        Integer term4275580 = new Integer(381787538);
        ArrayList term4275578 = new ArrayList();
        ((ArrayList) term4275578).add(term4275580);
        term4275491 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4275493 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4275509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4275510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4275514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4275519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4275520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4275524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4275491, term4275491.getClass(), "id", 8056618639428557480L);
        setLongField(term4275493, term4275493.getClass(), "id", -662745512970755221L);
        setField(term4275493, term4275493.getClass(), "extId", term4275495);
        setField(term4275493, term4275493.getClass(), "luid", "vHQQEFkTQk");
        setIntField(term4275510, term4275510.getClass(), "year", 2025);
        setShortField(term4275510, term4275510.getClass(), "month", (short) 3);
        setShortField(term4275510, term4275510.getClass(), "day", (short) 31);
        setField(term4275509, term4275509.getClass(), "date", term4275510);
        setByteField(term4275514, term4275514.getClass(), "hour", (byte) 11);
        setByteField(term4275514, term4275514.getClass(), "minute", (byte) 8);
        setByteField(term4275514, term4275514.getClass(), "second", (byte) 8);
        setIntField(term4275514, term4275514.getClass(), "nano", 700540284);
        setField(term4275509, term4275509.getClass(), "time", term4275514);
        setField(term4275493, term4275493.getClass(), "registerTime", term4275509);
        setIntField(term4275520, term4275520.getClass(), "year", 2021);
        setShortField(term4275520, term4275520.getClass(), "month", (short) 10);
        setShortField(term4275520, term4275520.getClass(), "day", (short) 19);
        setField(term4275519, term4275519.getClass(), "date", term4275520);
        setByteField(term4275524, term4275524.getClass(), "hour", (byte) 8);
        setByteField(term4275524, term4275524.getClass(), "minute", (byte) 17);
        setByteField(term4275524, term4275524.getClass(), "second", (byte) 11);
        setIntField(term4275524, term4275524.getClass(), "nano", 533709673);
        setField(term4275519, term4275519.getClass(), "time", term4275524);
        setField(term4275493, term4275493.getClass(), "accessTime", term4275519);
        setField(term4275491, term4275491.getClass(), "card", term4275493);
        setField(term4275491, term4275491.getClass(), "userName", "IApcfRBydK");
        setIntField(term4275491, term4275491.getClass(), "isNetMember", 848217903);
        setIntField(term4275491, term4275491.getClass(), "iconId", 56414591);
        setIntField(term4275491, term4275491.getClass(), "plateId", 1793841459);
        setIntField(term4275491, term4275491.getClass(), "titleId", 2084057979);
        setIntField(term4275491, term4275491.getClass(), "partnerId", 1069551154);
        setIntField(term4275491, term4275491.getClass(), "frameId", 105450089);
        setIntField(term4275491, term4275491.getClass(), "selectMapId", 812508761);
        setIntField(term4275491, term4275491.getClass(), "totalAwake", 1515488169);
        setIntField(term4275491, term4275491.getClass(), "gradeRating", -564553838);
        setIntField(term4275491, term4275491.getClass(), "musicRating", -505075369);
        setIntField(term4275491, term4275491.getClass(), "playerRating", 1819140377);
        setIntField(term4275491, term4275491.getClass(), "highestRating", 1846771769);
        setIntField(term4275491, term4275491.getClass(), "gradeRank", 792096160);
        setIntField(term4275491, term4275491.getClass(), "classRank", -1088040253);
        setIntField(term4275491, term4275491.getClass(), "courseRank", 1329835067);
        setField(term4275491, term4275491.getClass(), "charaSlot", term4275556);
        setField(term4275491, term4275491.getClass(), "charaLockSlot", term4275578);
        setLongField(term4275491, term4275491.getClass(), "contentBit", -6504358382915928831L);
        setIntField(term4275491, term4275491.getClass(), "playCount", 236253783);
        setField(term4275491, term4275491.getClass(), "eventWatchedDate", "aMnsxSHicR");
        setField(term4275491, term4275491.getClass(), "lastGameId", "lXlaBvkcui");
        setField(term4275491, term4275491.getClass(), "lastRomVersion", "BgMfligKwU");
        setField(term4275491, term4275491.getClass(), "lastDataVersion", "xcfLjZZSss");
        setField(term4275491, term4275491.getClass(), "lastLoginDate", "EPaDmNJRjU");
        setField(term4275491, term4275491.getClass(), "lastPlayDate", "FdYlzmzJBZ");
        setIntField(term4275491, term4275491.getClass(), "lastPlayCredit", -424417164);
        setIntField(term4275491, term4275491.getClass(), "lastPlayMode", 1131918060);
        setIntField(term4275491, term4275491.getClass(), "lastPlaceId", -1730485206);
        setField(term4275491, term4275491.getClass(), "lastPlaceName", "uaxkSlSQGl");
        setIntField(term4275491, term4275491.getClass(), "lastAllNetId", -2135330110);
        setIntField(term4275491, term4275491.getClass(), "lastRegionId", 333371955);
        setField(term4275491, term4275491.getClass(), "lastRegionName", "yJktWmgBig");
        setField(term4275491, term4275491.getClass(), "lastClientId", "zpcNDsiGKz");
        setField(term4275491, term4275491.getClass(), "lastCountryCode", "lWoBVdIieJ");
        setIntField(term4275491, term4275491.getClass(), "lastSelectEMoney", -1150259511);
        setIntField(term4275491, term4275491.getClass(), "lastSelectTicket", 2004135638);
        setIntField(term4275491, term4275491.getClass(), "lastSelectCourse", 1402914276);
        setIntField(term4275491, term4275491.getClass(), "lastCountCourse", 1435548563);
        setField(term4275491, term4275491.getClass(), "firstGameId", "bUZszctQPe");
        setField(term4275491, term4275491.getClass(), "firstRomVersion", "RunTPMUcmy");
        setField(term4275491, term4275491.getClass(), "firstDataVersion", "mPZTmDZpvu");
        setField(term4275491, term4275491.getClass(), "firstPlayDate", "GQhPRjaqIC");
        setField(term4275491, term4275491.getClass(), "compatibleCmVersion", "MTrIniflMl");
        setField(term4275491, term4275491.getClass(), "dailyBonusDate", "SwkxMqgMtm");
        setField(term4275491, term4275491.getClass(), "dailyCourseBonusDate", "ZtHerxCgjk");
        setField(term4275491, term4275491.getClass(), "lastPairLoginDate", "OfjMmFDqEV");
        setField(term4275491, term4275491.getClass(), "lastTrialPlayDate", "qlNGatDChP");
        setIntField(term4275491, term4275491.getClass(), "playVsCount", 1877553209);
        setIntField(term4275491, term4275491.getClass(), "playSyncCount", -170121765);
        setIntField(term4275491, term4275491.getClass(), "winCount", 1887266082);
        setIntField(term4275491, term4275491.getClass(), "helpCount", 932486303);
        setIntField(term4275491, term4275491.getClass(), "comboCount", 1807303038);
        setLongField(term4275491, term4275491.getClass(), "totalDeluxscore", 5019186400972926043L);
        setLongField(term4275491, term4275491.getClass(), "totalBasicDeluxscore", -4772998739658728484L);
        setLongField(term4275491, term4275491.getClass(), "totalAdvancedDeluxscore", -6161202922914155623L);
        setLongField(term4275491, term4275491.getClass(), "totalExpertDeluxscore", 3335199644489658714L);
        setLongField(term4275491, term4275491.getClass(), "totalMasterDeluxscore", 2956434119517494643L);
        setLongField(term4275491, term4275491.getClass(), "totalReMasterDeluxscore", -7118453224491933203L);
        setIntField(term4275491, term4275491.getClass(), "totalSync", -1166754078);
        setIntField(term4275491, term4275491.getClass(), "totalBasicSync", 1548011893);
        setIntField(term4275491, term4275491.getClass(), "totalAdvancedSync", -1792811593);
        setIntField(term4275491, term4275491.getClass(), "totalExpertSync", -2135266324);
        setIntField(term4275491, term4275491.getClass(), "totalMasterSync", 2099009095);
        setIntField(term4275491, term4275491.getClass(), "totalReMasterSync", -2061939911);
        setLongField(term4275491, term4275491.getClass(), "totalAchievement", -4098983619586585697L);
        setLongField(term4275491, term4275491.getClass(), "totalBasicAchievement", -5585665788410615525L);
        setLongField(term4275491, term4275491.getClass(), "totalAdvancedAchievement", 3891696641512350115L);
        setLongField(term4275491, term4275491.getClass(), "totalExpertAchievement", 3385673602065010306L);
        setLongField(term4275491, term4275491.getClass(), "totalMasterAchievement", -3557897447096833161L);
        setLongField(term4275491, term4275491.getClass(), "totalReMasterAchievement", -5484188935980390629L);
        setLongField(term4275491, term4275491.getClass(), "playerOldRating", 5132028472109664872L);
        setLongField(term4275491, term4275491.getClass(), "playerNewRating", 6348409297267599042L);
        setIntField(term4275491, term4275491.getClass(), "banState", 344388827);
        setLongField(term4275491, term4275491.getClass(), "dateTime", 6715677226844507198L);
        term4275850 = new Integer(791154141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4275850;
        callMethod(klass, "setIconId", argTypes, term4275491, args);
    }

};


