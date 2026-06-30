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

public class UserDetail_setTotalExpertAchievement_1286721729147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4313458;
     Object term4313815;

    public UserDetail_setTotalExpertAchievement_1286721729147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4313462 = new Long(-5611149132849899108L);
        Integer term4313525 = new Integer(191239283);
        ArrayList term4313523 = new ArrayList();
        ((ArrayList) term4313523).add(term4313525);
        Integer term4313531 = new Integer(367335503);
        Integer term4313533 = new Integer(-1858156484);
        Integer term4313535 = new Integer(1629598973);
        Integer term4313537 = new Integer(26411664);
        Integer term4313539 = new Integer(1791622790);
        Integer term4313541 = new Integer(-1666988360);
        Integer term4313543 = new Integer(1304377188);
        Integer term4313545 = new Integer(348283942);
        ArrayList term4313529 = new ArrayList();
        ((ArrayList) term4313529).add(term4313531);
        ((ArrayList) term4313529).add(term4313533);
        ((ArrayList) term4313529).add(term4313535);
        ((ArrayList) term4313529).add(term4313537);
        ((ArrayList) term4313529).add(term4313539);
        ((ArrayList) term4313529).add(term4313541);
        ((ArrayList) term4313529).add(term4313543);
        ((ArrayList) term4313529).add(term4313545);
        term4313458 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4313460 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4313476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4313477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4313481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4313486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4313487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4313491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4313458, term4313458.getClass(), "id", -6600411700101507647L);
        setLongField(term4313460, term4313460.getClass(), "id", -1295574233753854917L);
        setField(term4313460, term4313460.getClass(), "extId", term4313462);
        setField(term4313460, term4313460.getClass(), "luid", "VaFPIzkqsy");
        setIntField(term4313477, term4313477.getClass(), "year", 2026);
        setShortField(term4313477, term4313477.getClass(), "month", (short) 2);
        setShortField(term4313477, term4313477.getClass(), "day", (short) 9);
        setField(term4313476, term4313476.getClass(), "date", term4313477);
        setByteField(term4313481, term4313481.getClass(), "hour", (byte) 20);
        setByteField(term4313481, term4313481.getClass(), "minute", (byte) 32);
        setByteField(term4313481, term4313481.getClass(), "second", (byte) 37);
        setIntField(term4313481, term4313481.getClass(), "nano", 786044147);
        setField(term4313476, term4313476.getClass(), "time", term4313481);
        setField(term4313460, term4313460.getClass(), "registerTime", term4313476);
        setIntField(term4313487, term4313487.getClass(), "year", 2016);
        setShortField(term4313487, term4313487.getClass(), "month", (short) 5);
        setShortField(term4313487, term4313487.getClass(), "day", (short) 17);
        setField(term4313486, term4313486.getClass(), "date", term4313487);
        setByteField(term4313491, term4313491.getClass(), "hour", (byte) 14);
        setByteField(term4313491, term4313491.getClass(), "minute", (byte) 4);
        setByteField(term4313491, term4313491.getClass(), "second", (byte) 32);
        setIntField(term4313491, term4313491.getClass(), "nano", 134825617);
        setField(term4313486, term4313486.getClass(), "time", term4313491);
        setField(term4313460, term4313460.getClass(), "accessTime", term4313486);
        setField(term4313458, term4313458.getClass(), "card", term4313460);
        setField(term4313458, term4313458.getClass(), "userName", "tkKFwxRONG");
        setIntField(term4313458, term4313458.getClass(), "isNetMember", -594340517);
        setIntField(term4313458, term4313458.getClass(), "iconId", 2117945080);
        setIntField(term4313458, term4313458.getClass(), "plateId", -922042121);
        setIntField(term4313458, term4313458.getClass(), "titleId", 710040140);
        setIntField(term4313458, term4313458.getClass(), "partnerId", -1123016356);
        setIntField(term4313458, term4313458.getClass(), "frameId", -349961305);
        setIntField(term4313458, term4313458.getClass(), "selectMapId", -624466291);
        setIntField(term4313458, term4313458.getClass(), "totalAwake", 2035811931);
        setIntField(term4313458, term4313458.getClass(), "gradeRating", -155284508);
        setIntField(term4313458, term4313458.getClass(), "musicRating", -908125146);
        setIntField(term4313458, term4313458.getClass(), "playerRating", -1849896677);
        setIntField(term4313458, term4313458.getClass(), "highestRating", 1810287239);
        setIntField(term4313458, term4313458.getClass(), "gradeRank", 151118838);
        setIntField(term4313458, term4313458.getClass(), "classRank", 1817920905);
        setIntField(term4313458, term4313458.getClass(), "courseRank", 1931102457);
        setField(term4313458, term4313458.getClass(), "charaSlot", term4313523);
        setField(term4313458, term4313458.getClass(), "charaLockSlot", term4313529);
        setLongField(term4313458, term4313458.getClass(), "contentBit", -4653625788677066270L);
        setIntField(term4313458, term4313458.getClass(), "playCount", 543506402);
        setField(term4313458, term4313458.getClass(), "eventWatchedDate", "padvHWNZHh");
        setField(term4313458, term4313458.getClass(), "lastGameId", "ygzMBmpZXy");
        setField(term4313458, term4313458.getClass(), "lastRomVersion", "QMOJwRonkK");
        setField(term4313458, term4313458.getClass(), "lastDataVersion", "BYmExNSFLV");
        setField(term4313458, term4313458.getClass(), "lastLoginDate", "PlNUfXtDak");
        setField(term4313458, term4313458.getClass(), "lastPlayDate", "BvLqvFXuPr");
        setIntField(term4313458, term4313458.getClass(), "lastPlayCredit", 692177173);
        setIntField(term4313458, term4313458.getClass(), "lastPlayMode", 434212500);
        setIntField(term4313458, term4313458.getClass(), "lastPlaceId", 2098647857);
        setField(term4313458, term4313458.getClass(), "lastPlaceName", "PErsMsiGeX");
        setIntField(term4313458, term4313458.getClass(), "lastAllNetId", 435394168);
        setIntField(term4313458, term4313458.getClass(), "lastRegionId", -504812554);
        setField(term4313458, term4313458.getClass(), "lastRegionName", "YteNSFulRR");
        setField(term4313458, term4313458.getClass(), "lastClientId", "bPmOBcmeYl");
        setField(term4313458, term4313458.getClass(), "lastCountryCode", "zyirHMObjT");
        setIntField(term4313458, term4313458.getClass(), "lastSelectEMoney", -740842404);
        setIntField(term4313458, term4313458.getClass(), "lastSelectTicket", 698991441);
        setIntField(term4313458, term4313458.getClass(), "lastSelectCourse", -2089409390);
        setIntField(term4313458, term4313458.getClass(), "lastCountCourse", 625763959);
        setField(term4313458, term4313458.getClass(), "firstGameId", "rHBJBPhjWj");
        setField(term4313458, term4313458.getClass(), "firstRomVersion", "yjdWNDakhi");
        setField(term4313458, term4313458.getClass(), "firstDataVersion", "OpuYQtlLlg");
        setField(term4313458, term4313458.getClass(), "firstPlayDate", "JUpXlhsedt");
        setField(term4313458, term4313458.getClass(), "compatibleCmVersion", "AprvjGPVKY");
        setField(term4313458, term4313458.getClass(), "dailyBonusDate", "ysZewTvQFR");
        setField(term4313458, term4313458.getClass(), "dailyCourseBonusDate", "zLEAvNYudj");
        setField(term4313458, term4313458.getClass(), "lastPairLoginDate", "TMUTHkalPk");
        setField(term4313458, term4313458.getClass(), "lastTrialPlayDate", "AKsTWVnitF");
        setIntField(term4313458, term4313458.getClass(), "playVsCount", -936559315);
        setIntField(term4313458, term4313458.getClass(), "playSyncCount", -1218832767);
        setIntField(term4313458, term4313458.getClass(), "winCount", -903666119);
        setIntField(term4313458, term4313458.getClass(), "helpCount", 2076466896);
        setIntField(term4313458, term4313458.getClass(), "comboCount", -528822866);
        setLongField(term4313458, term4313458.getClass(), "totalDeluxscore", 2007564195051377209L);
        setLongField(term4313458, term4313458.getClass(), "totalBasicDeluxscore", 5056654584542346878L);
        setLongField(term4313458, term4313458.getClass(), "totalAdvancedDeluxscore", -2030875034820487836L);
        setLongField(term4313458, term4313458.getClass(), "totalExpertDeluxscore", -431633186616308111L);
        setLongField(term4313458, term4313458.getClass(), "totalMasterDeluxscore", -8232600261449158727L);
        setLongField(term4313458, term4313458.getClass(), "totalReMasterDeluxscore", -6466120181958207294L);
        setIntField(term4313458, term4313458.getClass(), "totalSync", -448795689);
        setIntField(term4313458, term4313458.getClass(), "totalBasicSync", -1045532423);
        setIntField(term4313458, term4313458.getClass(), "totalAdvancedSync", 1585195527);
        setIntField(term4313458, term4313458.getClass(), "totalExpertSync", -2039223229);
        setIntField(term4313458, term4313458.getClass(), "totalMasterSync", -1254838807);
        setIntField(term4313458, term4313458.getClass(), "totalReMasterSync", 1150689254);
        setLongField(term4313458, term4313458.getClass(), "totalAchievement", 5626567673501367258L);
        setLongField(term4313458, term4313458.getClass(), "totalBasicAchievement", 3335776336483280680L);
        setLongField(term4313458, term4313458.getClass(), "totalAdvancedAchievement", 7815730048604791094L);
        setLongField(term4313458, term4313458.getClass(), "totalExpertAchievement", -1178941911854257969L);
        setLongField(term4313458, term4313458.getClass(), "totalMasterAchievement", -7032322270730506650L);
        setLongField(term4313458, term4313458.getClass(), "totalReMasterAchievement", 236857861287603547L);
        setLongField(term4313458, term4313458.getClass(), "playerOldRating", 1923150470693533146L);
        setLongField(term4313458, term4313458.getClass(), "playerNewRating", -627297652703441875L);
        setIntField(term4313458, term4313458.getClass(), "banState", 1716642217);
        setLongField(term4313458, term4313458.getClass(), "dateTime", -4158477016833814348L);
        term4313815 = new Long(2418827866055031780L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4313815;
        callMethod(klass, "setTotalExpertAchievement", argTypes, term4313458, args);
    }

};


