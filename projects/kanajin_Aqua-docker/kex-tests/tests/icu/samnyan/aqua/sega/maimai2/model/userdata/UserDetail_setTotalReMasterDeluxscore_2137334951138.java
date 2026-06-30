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

public class UserDetail_setTotalReMasterDeluxscore_2137334951138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273674;
     Object term274023;

    public UserDetail_setTotalReMasterDeluxscore_2137334951138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273678 = new Long(4354242424632479389L);
        Integer term273741 = new Integer(434941375);
        Integer term273743 = new Integer(1467794711);
        ArrayList term273739 = new ArrayList();
        ((ArrayList) term273739).add(term273741);
        ((ArrayList) term273739).add(term273743);
        Integer term273749 = new Integer(-491366166);
        Integer term273751 = new Integer(1410370567);
        Integer term273753 = new Integer(2136820914);
        ArrayList term273747 = new ArrayList();
        ((ArrayList) term273747).add(term273749);
        ((ArrayList) term273747).add(term273751);
        ((ArrayList) term273747).add(term273753);
        term273674 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term273676 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term273692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273707 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273674, term273674.getClass(), "id", 4697978949711347326L);
        setLongField(term273676, term273676.getClass(), "id", 4231954806066351837L);
        setField(term273676, term273676.getClass(), "extId", term273678);
        setField(term273676, term273676.getClass(), "luid", "VBtTmYfmNa");
        setIntField(term273693, term273693.getClass(), "year", 2020);
        setShortField(term273693, term273693.getClass(), "month", (short) 12);
        setShortField(term273693, term273693.getClass(), "day", (short) 16);
        setField(term273692, term273692.getClass(), "date", term273693);
        setByteField(term273697, term273697.getClass(), "hour", (byte) 16);
        setByteField(term273697, term273697.getClass(), "minute", (byte) 53);
        setByteField(term273697, term273697.getClass(), "second", (byte) 36);
        setIntField(term273697, term273697.getClass(), "nano", 274961864);
        setField(term273692, term273692.getClass(), "time", term273697);
        setField(term273676, term273676.getClass(), "registerTime", term273692);
        setIntField(term273703, term273703.getClass(), "year", 2012);
        setShortField(term273703, term273703.getClass(), "month", (short) 6);
        setShortField(term273703, term273703.getClass(), "day", (short) 10);
        setField(term273702, term273702.getClass(), "date", term273703);
        setByteField(term273707, term273707.getClass(), "hour", (byte) 8);
        setByteField(term273707, term273707.getClass(), "minute", (byte) 28);
        setByteField(term273707, term273707.getClass(), "second", (byte) 42);
        setIntField(term273707, term273707.getClass(), "nano", 746576384);
        setField(term273702, term273702.getClass(), "time", term273707);
        setField(term273676, term273676.getClass(), "accessTime", term273702);
        setField(term273674, term273674.getClass(), "card", term273676);
        setField(term273674, term273674.getClass(), "userName", "vCMPzUJdqC");
        setIntField(term273674, term273674.getClass(), "isNetMember", 1130254738);
        setIntField(term273674, term273674.getClass(), "iconId", 1350953168);
        setIntField(term273674, term273674.getClass(), "plateId", -1493610451);
        setIntField(term273674, term273674.getClass(), "titleId", -2139568336);
        setIntField(term273674, term273674.getClass(), "partnerId", 1879485748);
        setIntField(term273674, term273674.getClass(), "frameId", -319165794);
        setIntField(term273674, term273674.getClass(), "selectMapId", 621790784);
        setIntField(term273674, term273674.getClass(), "totalAwake", -1918000204);
        setIntField(term273674, term273674.getClass(), "gradeRating", 1447275815);
        setIntField(term273674, term273674.getClass(), "musicRating", 1082981850);
        setIntField(term273674, term273674.getClass(), "playerRating", -1844294809);
        setIntField(term273674, term273674.getClass(), "highestRating", 598151803);
        setIntField(term273674, term273674.getClass(), "gradeRank", -587471809);
        setIntField(term273674, term273674.getClass(), "classRank", 361267393);
        setIntField(term273674, term273674.getClass(), "courseRank", 1886311523);
        setField(term273674, term273674.getClass(), "charaSlot", term273739);
        setField(term273674, term273674.getClass(), "charaLockSlot", term273747);
        setLongField(term273674, term273674.getClass(), "contentBit", -69879738358023968L);
        setIntField(term273674, term273674.getClass(), "playCount", 1318360293);
        setField(term273674, term273674.getClass(), "eventWatchedDate", "INruiLFsfz");
        setField(term273674, term273674.getClass(), "lastGameId", "hDxoYRMfgy");
        setField(term273674, term273674.getClass(), "lastRomVersion", "yROeoulaqm");
        setField(term273674, term273674.getClass(), "lastDataVersion", "CIUmcsCIbb");
        setField(term273674, term273674.getClass(), "lastLoginDate", "cxyEfrqGrT");
        setField(term273674, term273674.getClass(), "lastPlayDate", "iNWlplKXbV");
        setIntField(term273674, term273674.getClass(), "lastPlayCredit", -1027358936);
        setIntField(term273674, term273674.getClass(), "lastPlayMode", -1229208944);
        setIntField(term273674, term273674.getClass(), "lastPlaceId", -170120046);
        setField(term273674, term273674.getClass(), "lastPlaceName", "fBfqYGNHMg");
        setIntField(term273674, term273674.getClass(), "lastAllNetId", -1709733909);
        setIntField(term273674, term273674.getClass(), "lastRegionId", -894844741);
        setField(term273674, term273674.getClass(), "lastRegionName", "EhJBVHJugj");
        setField(term273674, term273674.getClass(), "lastClientId", "pXLxrqAmzp");
        setField(term273674, term273674.getClass(), "lastCountryCode", "LhWpueIEqM");
        setIntField(term273674, term273674.getClass(), "lastSelectEMoney", -166384825);
        setIntField(term273674, term273674.getClass(), "lastSelectTicket", 351927390);
        setIntField(term273674, term273674.getClass(), "lastSelectCourse", 2065832838);
        setIntField(term273674, term273674.getClass(), "lastCountCourse", -359026798);
        setField(term273674, term273674.getClass(), "firstGameId", "ELkVeustOS");
        setField(term273674, term273674.getClass(), "firstRomVersion", "NXUwdcgoJG");
        setField(term273674, term273674.getClass(), "firstDataVersion", "CtWqGIvLXM");
        setField(term273674, term273674.getClass(), "firstPlayDate", "Pafhaztesm");
        setField(term273674, term273674.getClass(), "compatibleCmVersion", "mlCfQttDxD");
        setField(term273674, term273674.getClass(), "dailyBonusDate", "NfgCMMnVsi");
        setField(term273674, term273674.getClass(), "dailyCourseBonusDate", "iDkTzOynIZ");
        setField(term273674, term273674.getClass(), "lastPairLoginDate", "sRZQZFejMq");
        setField(term273674, term273674.getClass(), "lastTrialPlayDate", "OHCMtEBKVg");
        setIntField(term273674, term273674.getClass(), "playVsCount", 1681890223);
        setIntField(term273674, term273674.getClass(), "playSyncCount", -1958329610);
        setIntField(term273674, term273674.getClass(), "winCount", 381934673);
        setIntField(term273674, term273674.getClass(), "helpCount", -817067810);
        setIntField(term273674, term273674.getClass(), "comboCount", -983086690);
        setLongField(term273674, term273674.getClass(), "totalDeluxscore", -2295044452055159380L);
        setLongField(term273674, term273674.getClass(), "totalBasicDeluxscore", -8093092425828256529L);
        setLongField(term273674, term273674.getClass(), "totalAdvancedDeluxscore", -8529589100747561913L);
        setLongField(term273674, term273674.getClass(), "totalExpertDeluxscore", 4597916988539451862L);
        setLongField(term273674, term273674.getClass(), "totalMasterDeluxscore", -5238853432038851417L);
        setLongField(term273674, term273674.getClass(), "totalReMasterDeluxscore", 656660544045525449L);
        setIntField(term273674, term273674.getClass(), "totalSync", 2105816896);
        setIntField(term273674, term273674.getClass(), "totalBasicSync", 1090696044);
        setIntField(term273674, term273674.getClass(), "totalAdvancedSync", -222016393);
        setIntField(term273674, term273674.getClass(), "totalExpertSync", 1471782009);
        setIntField(term273674, term273674.getClass(), "totalMasterSync", 503038990);
        setIntField(term273674, term273674.getClass(), "totalReMasterSync", -412516188);
        setLongField(term273674, term273674.getClass(), "totalAchievement", 4486949678479545166L);
        setLongField(term273674, term273674.getClass(), "totalBasicAchievement", -7780822153793339761L);
        setLongField(term273674, term273674.getClass(), "totalAdvancedAchievement", -1081065334603558553L);
        setLongField(term273674, term273674.getClass(), "totalExpertAchievement", -1165819408782570944L);
        setLongField(term273674, term273674.getClass(), "totalMasterAchievement", 6515641205751915818L);
        setLongField(term273674, term273674.getClass(), "totalReMasterAchievement", -4932499970481422256L);
        setLongField(term273674, term273674.getClass(), "playerOldRating", 3488149133235281029L);
        setLongField(term273674, term273674.getClass(), "playerNewRating", 8537622146090289867L);
        setIntField(term273674, term273674.getClass(), "banState", 1789916724);
        setLongField(term273674, term273674.getClass(), "dateTime", -8984045775963503112L);
        term274023 = new Long(-6115620383731978271L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term274023;
        callMethod(klass, "setTotalReMasterDeluxscore", argTypes, term273674, args);
    }

};


