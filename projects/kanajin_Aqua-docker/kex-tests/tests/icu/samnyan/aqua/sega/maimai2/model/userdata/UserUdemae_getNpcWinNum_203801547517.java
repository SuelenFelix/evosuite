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

public class UserUdemae_getNpcWinNum_203801547517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104310;

    public UserUdemae_getNpcWinNum_203801547517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104316 = new Long(5219030281405653303L);
        Integer term104379 = new Integer(512521742);
        Integer term104381 = new Integer(1291000976);
        Integer term104383 = new Integer(1143522832);
        ArrayList term104377 = new ArrayList();
        ((ArrayList) term104377).add(term104379);
        ((ArrayList) term104377).add(term104381);
        ((ArrayList) term104377).add(term104383);
        Integer term104389 = new Integer(40965975);
        Integer term104391 = new Integer(-194718582);
        Integer term104393 = new Integer(42982854);
        Integer term104395 = new Integer(-1129506480);
        Integer term104397 = new Integer(301438568);
        Integer term104399 = new Integer(-1667908453);
        Integer term104401 = new Integer(315910438);
        ArrayList term104387 = new ArrayList();
        ((ArrayList) term104387).add(term104389);
        ((ArrayList) term104387).add(term104391);
        ((ArrayList) term104387).add(term104393);
        ((ArrayList) term104387).add(term104395);
        ((ArrayList) term104387).add(term104397);
        ((ArrayList) term104387).add(term104399);
        ((ArrayList) term104387).add(term104401);
        term104310 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term104312 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term104314 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104345 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104310, term104310.getClass(), "id", 8118053651038956587L);
        setLongField(term104312, term104312.getClass(), "id", 801474024116335106L);
        setLongField(term104314, term104314.getClass(), "id", -433903080990391127L);
        setField(term104314, term104314.getClass(), "extId", term104316);
        setField(term104314, term104314.getClass(), "luid", "eNcuSzCfin");
        setIntField(term104331, term104331.getClass(), "year", 2013);
        setShortField(term104331, term104331.getClass(), "month", (short) 6);
        setShortField(term104331, term104331.getClass(), "day", (short) 29);
        setField(term104330, term104330.getClass(), "date", term104331);
        setByteField(term104335, term104335.getClass(), "hour", (byte) 22);
        setByteField(term104335, term104335.getClass(), "minute", (byte) 31);
        setByteField(term104335, term104335.getClass(), "second", (byte) 28);
        setIntField(term104335, term104335.getClass(), "nano", 930397670);
        setField(term104330, term104330.getClass(), "time", term104335);
        setField(term104314, term104314.getClass(), "registerTime", term104330);
        setIntField(term104341, term104341.getClass(), "year", 2020);
        setShortField(term104341, term104341.getClass(), "month", (short) 5);
        setShortField(term104341, term104341.getClass(), "day", (short) 8);
        setField(term104340, term104340.getClass(), "date", term104341);
        setByteField(term104345, term104345.getClass(), "hour", (byte) 14);
        setByteField(term104345, term104345.getClass(), "minute", (byte) 28);
        setByteField(term104345, term104345.getClass(), "second", (byte) 38);
        setIntField(term104345, term104345.getClass(), "nano", 93855882);
        setField(term104340, term104340.getClass(), "time", term104345);
        setField(term104314, term104314.getClass(), "accessTime", term104340);
        setField(term104312, term104312.getClass(), "card", term104314);
        setField(term104312, term104312.getClass(), "userName", "lujQENuAbC");
        setIntField(term104312, term104312.getClass(), "isNetMember", 2136375684);
        setIntField(term104312, term104312.getClass(), "iconId", 1534903857);
        setIntField(term104312, term104312.getClass(), "plateId", -1364694166);
        setIntField(term104312, term104312.getClass(), "titleId", -1031588818);
        setIntField(term104312, term104312.getClass(), "partnerId", -2142065668);
        setIntField(term104312, term104312.getClass(), "frameId", -1027337235);
        setIntField(term104312, term104312.getClass(), "selectMapId", 2078039172);
        setIntField(term104312, term104312.getClass(), "totalAwake", 810570789);
        setIntField(term104312, term104312.getClass(), "gradeRating", 1688150689);
        setIntField(term104312, term104312.getClass(), "musicRating", -1900819498);
        setIntField(term104312, term104312.getClass(), "playerRating", -1374608663);
        setIntField(term104312, term104312.getClass(), "highestRating", -1618100560);
        setIntField(term104312, term104312.getClass(), "gradeRank", 751804772);
        setIntField(term104312, term104312.getClass(), "classRank", 1423413334);
        setIntField(term104312, term104312.getClass(), "courseRank", -1579434672);
        setField(term104312, term104312.getClass(), "charaSlot", term104377);
        setField(term104312, term104312.getClass(), "charaLockSlot", term104387);
        setLongField(term104312, term104312.getClass(), "contentBit", 1989061074999485854L);
        setIntField(term104312, term104312.getClass(), "playCount", 609266606);
        setField(term104312, term104312.getClass(), "eventWatchedDate", "qkbmnArlda");
        setField(term104312, term104312.getClass(), "lastGameId", "yvOcemZnPj");
        setField(term104312, term104312.getClass(), "lastRomVersion", "xAxPUWaeyn");
        setField(term104312, term104312.getClass(), "lastDataVersion", "QrXzPOoTMM");
        setField(term104312, term104312.getClass(), "lastLoginDate", "ovDeGFzsPr");
        setField(term104312, term104312.getClass(), "lastPlayDate", "MetUQYZAvL");
        setIntField(term104312, term104312.getClass(), "lastPlayCredit", 1221933023);
        setIntField(term104312, term104312.getClass(), "lastPlayMode", -216688430);
        setIntField(term104312, term104312.getClass(), "lastPlaceId", 456466881);
        setField(term104312, term104312.getClass(), "lastPlaceName", "TfZIVTqpIe");
        setIntField(term104312, term104312.getClass(), "lastAllNetId", -106998943);
        setIntField(term104312, term104312.getClass(), "lastRegionId", 1961013692);
        setField(term104312, term104312.getClass(), "lastRegionName", "DAYFgLtcSK");
        setField(term104312, term104312.getClass(), "lastClientId", "yYSkqbbdqk");
        setField(term104312, term104312.getClass(), "lastCountryCode", "pZqOHvYzUt");
        setIntField(term104312, term104312.getClass(), "lastSelectEMoney", -957809597);
        setIntField(term104312, term104312.getClass(), "lastSelectTicket", 1086125728);
        setIntField(term104312, term104312.getClass(), "lastSelectCourse", 1992510749);
        setIntField(term104312, term104312.getClass(), "lastCountCourse", -1803247273);
        setField(term104312, term104312.getClass(), "firstGameId", "DtSvRdcfBd");
        setField(term104312, term104312.getClass(), "firstRomVersion", "rfJbISvNQS");
        setField(term104312, term104312.getClass(), "firstDataVersion", "SoQIwZITjf");
        setField(term104312, term104312.getClass(), "firstPlayDate", "MuFCHnASsR");
        setField(term104312, term104312.getClass(), "compatibleCmVersion", "lTGjdlngGR");
        setField(term104312, term104312.getClass(), "dailyBonusDate", "VXtvOjnEqD");
        setField(term104312, term104312.getClass(), "dailyCourseBonusDate", "CvLRyPNOVI");
        setField(term104312, term104312.getClass(), "lastPairLoginDate", "kGkLTNoGnp");
        setField(term104312, term104312.getClass(), "lastTrialPlayDate", "CptQjqRnUi");
        setIntField(term104312, term104312.getClass(), "playVsCount", -1755475707);
        setIntField(term104312, term104312.getClass(), "playSyncCount", -1233102871);
        setIntField(term104312, term104312.getClass(), "winCount", -573135556);
        setIntField(term104312, term104312.getClass(), "helpCount", 995946657);
        setIntField(term104312, term104312.getClass(), "comboCount", -1689684498);
        setLongField(term104312, term104312.getClass(), "totalDeluxscore", 4070330593262624489L);
        setLongField(term104312, term104312.getClass(), "totalBasicDeluxscore", 2686508286588631111L);
        setLongField(term104312, term104312.getClass(), "totalAdvancedDeluxscore", -3949646833091670623L);
        setLongField(term104312, term104312.getClass(), "totalExpertDeluxscore", 6452661156585832400L);
        setLongField(term104312, term104312.getClass(), "totalMasterDeluxscore", 8434360451654713658L);
        setLongField(term104312, term104312.getClass(), "totalReMasterDeluxscore", 7064473722660118998L);
        setIntField(term104312, term104312.getClass(), "totalSync", -1408160580);
        setIntField(term104312, term104312.getClass(), "totalBasicSync", -1606951340);
        setIntField(term104312, term104312.getClass(), "totalAdvancedSync", 1066146888);
        setIntField(term104312, term104312.getClass(), "totalExpertSync", 409835682);
        setIntField(term104312, term104312.getClass(), "totalMasterSync", -2088840932);
        setIntField(term104312, term104312.getClass(), "totalReMasterSync", 1470124459);
        setLongField(term104312, term104312.getClass(), "totalAchievement", -3328202565303629170L);
        setLongField(term104312, term104312.getClass(), "totalBasicAchievement", -7303222772169138653L);
        setLongField(term104312, term104312.getClass(), "totalAdvancedAchievement", -5237668391482898957L);
        setLongField(term104312, term104312.getClass(), "totalExpertAchievement", 6347050696926206807L);
        setLongField(term104312, term104312.getClass(), "totalMasterAchievement", -6693328220911275400L);
        setLongField(term104312, term104312.getClass(), "totalReMasterAchievement", -6217009676274443835L);
        setLongField(term104312, term104312.getClass(), "playerOldRating", 4798281117299013998L);
        setLongField(term104312, term104312.getClass(), "playerNewRating", 4734290833546653850L);
        setIntField(term104312, term104312.getClass(), "banState", 1708162324);
        setLongField(term104312, term104312.getClass(), "dateTime", 6957785192444979753L);
        setField(term104310, term104310.getClass(), "user", term104312);
        setIntField(term104310, term104310.getClass(), "rate", 686279974);
        setIntField(term104310, term104310.getClass(), "maxRate", 2022250483);
        setIntField(term104310, term104310.getClass(), "classValue", 509321963);
        setIntField(term104310, term104310.getClass(), "maxClassValue", -2063187052);
        setIntField(term104310, term104310.getClass(), "totalWinNum", 133581490);
        setIntField(term104310, term104310.getClass(), "totalLoseNum", -579671719);
        setIntField(term104310, term104310.getClass(), "maxWinNum", -1915340015);
        setIntField(term104310, term104310.getClass(), "maxLoseNum", -600241671);
        setIntField(term104310, term104310.getClass(), "winNum", -1229610550);
        setIntField(term104310, term104310.getClass(), "loseNum", 493486357);
        setIntField(term104310, term104310.getClass(), "npcTotalWinNum", 329514667);
        setIntField(term104310, term104310.getClass(), "npcTotalLoseNum", 1579294785);
        setIntField(term104310, term104310.getClass(), "npcMaxWinNum", 41910159);
        setIntField(term104310, term104310.getClass(), "npcMaxLoseNum", 2144178531);
        setIntField(term104310, term104310.getClass(), "npcWinNum", -1853902014);
        setIntField(term104310, term104310.getClass(), "npcLoseNum", 1694299799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcWinNum", argTypes, term104310, args);
    }

};


