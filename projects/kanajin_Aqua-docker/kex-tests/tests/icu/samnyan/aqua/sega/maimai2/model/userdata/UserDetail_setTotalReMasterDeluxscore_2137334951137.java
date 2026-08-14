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

public class UserDetail_setTotalReMasterDeluxscore_2137334951137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273619;
     Object term273968;

    public UserDetail_setTotalReMasterDeluxscore_2137334951137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273623 = new Long(4354242424632479389L);
        Integer term273686 = new Integer(434941375);
        Integer term273688 = new Integer(1467794711);
        ArrayList term273684 = new ArrayList();
        ((ArrayList) term273684).add(term273686);
        ((ArrayList) term273684).add(term273688);
        Integer term273694 = new Integer(-491366166);
        Integer term273696 = new Integer(1410370567);
        Integer term273698 = new Integer(2136820914);
        ArrayList term273692 = new ArrayList();
        ((ArrayList) term273692).add(term273694);
        ((ArrayList) term273692).add(term273696);
        ((ArrayList) term273692).add(term273698);
        term273619 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term273621 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term273637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273652 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273619, term273619.getClass(), "id", 4697978949711347326L);
        setLongField(term273621, term273621.getClass(), "id", 4231954806066351837L);
        setField(term273621, term273621.getClass(), "extId", term273623);
        setField(term273621, term273621.getClass(), "luid", "VBtTmYfmNa");
        setIntField(term273638, term273638.getClass(), "year", 2020);
        setShortField(term273638, term273638.getClass(), "month", (short) 12);
        setShortField(term273638, term273638.getClass(), "day", (short) 16);
        setField(term273637, term273637.getClass(), "date", term273638);
        setByteField(term273642, term273642.getClass(), "hour", (byte) 16);
        setByteField(term273642, term273642.getClass(), "minute", (byte) 53);
        setByteField(term273642, term273642.getClass(), "second", (byte) 36);
        setIntField(term273642, term273642.getClass(), "nano", 274961864);
        setField(term273637, term273637.getClass(), "time", term273642);
        setField(term273621, term273621.getClass(), "registerTime", term273637);
        setIntField(term273648, term273648.getClass(), "year", 2012);
        setShortField(term273648, term273648.getClass(), "month", (short) 6);
        setShortField(term273648, term273648.getClass(), "day", (short) 10);
        setField(term273647, term273647.getClass(), "date", term273648);
        setByteField(term273652, term273652.getClass(), "hour", (byte) 8);
        setByteField(term273652, term273652.getClass(), "minute", (byte) 28);
        setByteField(term273652, term273652.getClass(), "second", (byte) 42);
        setIntField(term273652, term273652.getClass(), "nano", 746576384);
        setField(term273647, term273647.getClass(), "time", term273652);
        setField(term273621, term273621.getClass(), "accessTime", term273647);
        setField(term273619, term273619.getClass(), "card", term273621);
        setField(term273619, term273619.getClass(), "userName", "vCMPzUJdqC");
        setIntField(term273619, term273619.getClass(), "isNetMember", 1130254738);
        setIntField(term273619, term273619.getClass(), "iconId", 1350953168);
        setIntField(term273619, term273619.getClass(), "plateId", -1493610451);
        setIntField(term273619, term273619.getClass(), "titleId", -2139568336);
        setIntField(term273619, term273619.getClass(), "partnerId", 1879485748);
        setIntField(term273619, term273619.getClass(), "frameId", -319165794);
        setIntField(term273619, term273619.getClass(), "selectMapId", 621790784);
        setIntField(term273619, term273619.getClass(), "totalAwake", -1918000204);
        setIntField(term273619, term273619.getClass(), "gradeRating", 1447275815);
        setIntField(term273619, term273619.getClass(), "musicRating", 1082981850);
        setIntField(term273619, term273619.getClass(), "playerRating", -1844294809);
        setIntField(term273619, term273619.getClass(), "highestRating", 598151803);
        setIntField(term273619, term273619.getClass(), "gradeRank", -587471809);
        setIntField(term273619, term273619.getClass(), "classRank", 361267393);
        setIntField(term273619, term273619.getClass(), "courseRank", 1886311523);
        setField(term273619, term273619.getClass(), "charaSlot", term273684);
        setField(term273619, term273619.getClass(), "charaLockSlot", term273692);
        setLongField(term273619, term273619.getClass(), "contentBit", -69879738358023968L);
        setIntField(term273619, term273619.getClass(), "playCount", 1318360293);
        setField(term273619, term273619.getClass(), "eventWatchedDate", "INruiLFsfz");
        setField(term273619, term273619.getClass(), "lastGameId", "hDxoYRMfgy");
        setField(term273619, term273619.getClass(), "lastRomVersion", "yROeoulaqm");
        setField(term273619, term273619.getClass(), "lastDataVersion", "CIUmcsCIbb");
        setField(term273619, term273619.getClass(), "lastLoginDate", "cxyEfrqGrT");
        setField(term273619, term273619.getClass(), "lastPlayDate", "iNWlplKXbV");
        setIntField(term273619, term273619.getClass(), "lastPlayCredit", -1027358936);
        setIntField(term273619, term273619.getClass(), "lastPlayMode", -1229208944);
        setIntField(term273619, term273619.getClass(), "lastPlaceId", -170120046);
        setField(term273619, term273619.getClass(), "lastPlaceName", "fBfqYGNHMg");
        setIntField(term273619, term273619.getClass(), "lastAllNetId", -1709733909);
        setIntField(term273619, term273619.getClass(), "lastRegionId", -894844741);
        setField(term273619, term273619.getClass(), "lastRegionName", "EhJBVHJugj");
        setField(term273619, term273619.getClass(), "lastClientId", "pXLxrqAmzp");
        setField(term273619, term273619.getClass(), "lastCountryCode", "LhWpueIEqM");
        setIntField(term273619, term273619.getClass(), "lastSelectEMoney", -166384825);
        setIntField(term273619, term273619.getClass(), "lastSelectTicket", 351927390);
        setIntField(term273619, term273619.getClass(), "lastSelectCourse", 2065832838);
        setIntField(term273619, term273619.getClass(), "lastCountCourse", -359026798);
        setField(term273619, term273619.getClass(), "firstGameId", "ELkVeustOS");
        setField(term273619, term273619.getClass(), "firstRomVersion", "NXUwdcgoJG");
        setField(term273619, term273619.getClass(), "firstDataVersion", "CtWqGIvLXM");
        setField(term273619, term273619.getClass(), "firstPlayDate", "Pafhaztesm");
        setField(term273619, term273619.getClass(), "compatibleCmVersion", "mlCfQttDxD");
        setField(term273619, term273619.getClass(), "dailyBonusDate", "NfgCMMnVsi");
        setField(term273619, term273619.getClass(), "dailyCourseBonusDate", "iDkTzOynIZ");
        setField(term273619, term273619.getClass(), "lastPairLoginDate", "sRZQZFejMq");
        setField(term273619, term273619.getClass(), "lastTrialPlayDate", "OHCMtEBKVg");
        setIntField(term273619, term273619.getClass(), "playVsCount", 1681890223);
        setIntField(term273619, term273619.getClass(), "playSyncCount", -1958329610);
        setIntField(term273619, term273619.getClass(), "winCount", 381934673);
        setIntField(term273619, term273619.getClass(), "helpCount", -817067810);
        setIntField(term273619, term273619.getClass(), "comboCount", -983086690);
        setLongField(term273619, term273619.getClass(), "totalDeluxscore", -2295044452055159380L);
        setLongField(term273619, term273619.getClass(), "totalBasicDeluxscore", -8093092425828256529L);
        setLongField(term273619, term273619.getClass(), "totalAdvancedDeluxscore", -8529589100747561913L);
        setLongField(term273619, term273619.getClass(), "totalExpertDeluxscore", 4597916988539451862L);
        setLongField(term273619, term273619.getClass(), "totalMasterDeluxscore", -5238853432038851417L);
        setLongField(term273619, term273619.getClass(), "totalReMasterDeluxscore", 656660544045525449L);
        setIntField(term273619, term273619.getClass(), "totalSync", 2105816896);
        setIntField(term273619, term273619.getClass(), "totalBasicSync", 1090696044);
        setIntField(term273619, term273619.getClass(), "totalAdvancedSync", -222016393);
        setIntField(term273619, term273619.getClass(), "totalExpertSync", 1471782009);
        setIntField(term273619, term273619.getClass(), "totalMasterSync", 503038990);
        setIntField(term273619, term273619.getClass(), "totalReMasterSync", -412516188);
        setLongField(term273619, term273619.getClass(), "totalAchievement", 4486949678479545166L);
        setLongField(term273619, term273619.getClass(), "totalBasicAchievement", -7780822153793339761L);
        setLongField(term273619, term273619.getClass(), "totalAdvancedAchievement", -1081065334603558553L);
        setLongField(term273619, term273619.getClass(), "totalExpertAchievement", -1165819408782570944L);
        setLongField(term273619, term273619.getClass(), "totalMasterAchievement", 6515641205751915818L);
        setLongField(term273619, term273619.getClass(), "totalReMasterAchievement", -4932499970481422256L);
        setLongField(term273619, term273619.getClass(), "playerOldRating", 3488149133235281029L);
        setLongField(term273619, term273619.getClass(), "playerNewRating", 8537622146090289867L);
        setIntField(term273619, term273619.getClass(), "banState", 1789916724);
        setLongField(term273619, term273619.getClass(), "dateTime", -8984045775963503112L);
        term273968 = new Long(-6115620383731978271L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term273968;
        callMethod(klass, "setTotalReMasterDeluxscore", argTypes, term273619, args);
    }

};


