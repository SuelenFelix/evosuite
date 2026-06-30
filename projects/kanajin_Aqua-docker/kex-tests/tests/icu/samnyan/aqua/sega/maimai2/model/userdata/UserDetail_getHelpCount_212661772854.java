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

public class UserDetail_getHelpCount_212661772854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225630;

    public UserDetail_getHelpCount_212661772854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term225634 = new Long(7006402814669334483L);
        Integer term225697 = new Integer(293875732);
        Integer term225699 = new Integer(-375636222);
        Integer term225701 = new Integer(2019131833);
        Integer term225703 = new Integer(-2057057319);
        Integer term225705 = new Integer(-872007840);
        Integer term225707 = new Integer(614977875);
        Integer term225709 = new Integer(-424672642);
        Integer term225711 = new Integer(-1836107736);
        ArrayList term225695 = new ArrayList();
        ((ArrayList) term225695).add(term225697);
        ((ArrayList) term225695).add(term225699);
        ((ArrayList) term225695).add(term225701);
        ((ArrayList) term225695).add(term225703);
        ((ArrayList) term225695).add(term225705);
        ((ArrayList) term225695).add(term225707);
        ((ArrayList) term225695).add(term225709);
        ((ArrayList) term225695).add(term225711);
        Integer term225717 = new Integer(1774306588);
        Integer term225719 = new Integer(897867869);
        Integer term225721 = new Integer(-1058380964);
        Integer term225723 = new Integer(1144389305);
        Integer term225725 = new Integer(785140032);
        Integer term225727 = new Integer(2011478303);
        Integer term225729 = new Integer(-1064254847);
        Integer term225731 = new Integer(427797900);
        Integer term225733 = new Integer(948009124);
        ArrayList term225715 = new ArrayList();
        ((ArrayList) term225715).add(term225717);
        ((ArrayList) term225715).add(term225719);
        ((ArrayList) term225715).add(term225721);
        ((ArrayList) term225715).add(term225723);
        ((ArrayList) term225715).add(term225725);
        ((ArrayList) term225715).add(term225727);
        ((ArrayList) term225715).add(term225729);
        ((ArrayList) term225715).add(term225731);
        ((ArrayList) term225715).add(term225733);
        term225630 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term225632 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term225648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term225658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225663 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term225630, term225630.getClass(), "id", 351279025584289695L);
        setLongField(term225632, term225632.getClass(), "id", 4461616566482480930L);
        setField(term225632, term225632.getClass(), "extId", term225634);
        setField(term225632, term225632.getClass(), "luid", "gaoSmACbfX");
        setIntField(term225649, term225649.getClass(), "year", 2025);
        setShortField(term225649, term225649.getClass(), "month", (short) 8);
        setShortField(term225649, term225649.getClass(), "day", (short) 27);
        setField(term225648, term225648.getClass(), "date", term225649);
        setByteField(term225653, term225653.getClass(), "hour", (byte) 17);
        setByteField(term225653, term225653.getClass(), "minute", (byte) 10);
        setByteField(term225653, term225653.getClass(), "second", (byte) 17);
        setIntField(term225653, term225653.getClass(), "nano", 43520203);
        setField(term225648, term225648.getClass(), "time", term225653);
        setField(term225632, term225632.getClass(), "registerTime", term225648);
        setIntField(term225659, term225659.getClass(), "year", 2029);
        setShortField(term225659, term225659.getClass(), "month", (short) 4);
        setShortField(term225659, term225659.getClass(), "day", (short) 4);
        setField(term225658, term225658.getClass(), "date", term225659);
        setByteField(term225663, term225663.getClass(), "hour", (byte) 21);
        setByteField(term225663, term225663.getClass(), "minute", (byte) 28);
        setByteField(term225663, term225663.getClass(), "second", (byte) 58);
        setIntField(term225663, term225663.getClass(), "nano", 639031577);
        setField(term225658, term225658.getClass(), "time", term225663);
        setField(term225632, term225632.getClass(), "accessTime", term225658);
        setField(term225630, term225630.getClass(), "card", term225632);
        setField(term225630, term225630.getClass(), "userName", "CExsOhxVrR");
        setIntField(term225630, term225630.getClass(), "isNetMember", 585407284);
        setIntField(term225630, term225630.getClass(), "iconId", -1453114237);
        setIntField(term225630, term225630.getClass(), "plateId", 1408014748);
        setIntField(term225630, term225630.getClass(), "titleId", -1808362201);
        setIntField(term225630, term225630.getClass(), "partnerId", -1948153194);
        setIntField(term225630, term225630.getClass(), "frameId", 847610205);
        setIntField(term225630, term225630.getClass(), "selectMapId", 278413809);
        setIntField(term225630, term225630.getClass(), "totalAwake", 917959261);
        setIntField(term225630, term225630.getClass(), "gradeRating", 919466486);
        setIntField(term225630, term225630.getClass(), "musicRating", -1201638276);
        setIntField(term225630, term225630.getClass(), "playerRating", 1343406968);
        setIntField(term225630, term225630.getClass(), "highestRating", -279850700);
        setIntField(term225630, term225630.getClass(), "gradeRank", 2061426713);
        setIntField(term225630, term225630.getClass(), "classRank", -1674907707);
        setIntField(term225630, term225630.getClass(), "courseRank", -161061296);
        setField(term225630, term225630.getClass(), "charaSlot", term225695);
        setField(term225630, term225630.getClass(), "charaLockSlot", term225715);
        setLongField(term225630, term225630.getClass(), "contentBit", 3234389094474790303L);
        setIntField(term225630, term225630.getClass(), "playCount", 1870072131);
        setField(term225630, term225630.getClass(), "eventWatchedDate", "jBNkgaLRsS");
        setField(term225630, term225630.getClass(), "lastGameId", "PehUNmWvHv");
        setField(term225630, term225630.getClass(), "lastRomVersion", "UapHpyGCel");
        setField(term225630, term225630.getClass(), "lastDataVersion", "LmrvTTLapr");
        setField(term225630, term225630.getClass(), "lastLoginDate", "OlSJsSLyCa");
        setField(term225630, term225630.getClass(), "lastPlayDate", "PxApxgGmqd");
        setIntField(term225630, term225630.getClass(), "lastPlayCredit", 2143067629);
        setIntField(term225630, term225630.getClass(), "lastPlayMode", 1813631828);
        setIntField(term225630, term225630.getClass(), "lastPlaceId", 1323160882);
        setField(term225630, term225630.getClass(), "lastPlaceName", "EuKWqkSaMW");
        setIntField(term225630, term225630.getClass(), "lastAllNetId", 1113398500);
        setIntField(term225630, term225630.getClass(), "lastRegionId", 80339386);
        setField(term225630, term225630.getClass(), "lastRegionName", "NYfLLlFAwk");
        setField(term225630, term225630.getClass(), "lastClientId", "ryVxyRTkkz");
        setField(term225630, term225630.getClass(), "lastCountryCode", "NOFdXeSrBs");
        setIntField(term225630, term225630.getClass(), "lastSelectEMoney", 10586783);
        setIntField(term225630, term225630.getClass(), "lastSelectTicket", 1404577219);
        setIntField(term225630, term225630.getClass(), "lastSelectCourse", -1718338317);
        setIntField(term225630, term225630.getClass(), "lastCountCourse", 30310807);
        setField(term225630, term225630.getClass(), "firstGameId", "RUlqnYyZPt");
        setField(term225630, term225630.getClass(), "firstRomVersion", "COBVzmryOp");
        setField(term225630, term225630.getClass(), "firstDataVersion", "nVkuONqxFg");
        setField(term225630, term225630.getClass(), "firstPlayDate", "JBPNAgHgey");
        setField(term225630, term225630.getClass(), "compatibleCmVersion", "wmMerZnJUw");
        setField(term225630, term225630.getClass(), "dailyBonusDate", "ewUZPdbQIm");
        setField(term225630, term225630.getClass(), "dailyCourseBonusDate", "nsyKPkuiKM");
        setField(term225630, term225630.getClass(), "lastPairLoginDate", "QQrzJyhVFh");
        setField(term225630, term225630.getClass(), "lastTrialPlayDate", "DifGXOBiwI");
        setIntField(term225630, term225630.getClass(), "playVsCount", 1550335964);
        setIntField(term225630, term225630.getClass(), "playSyncCount", -1163619800);
        setIntField(term225630, term225630.getClass(), "winCount", 853492949);
        setIntField(term225630, term225630.getClass(), "helpCount", 1115052318);
        setIntField(term225630, term225630.getClass(), "comboCount", -1113759328);
        setLongField(term225630, term225630.getClass(), "totalDeluxscore", 9007807794250938645L);
        setLongField(term225630, term225630.getClass(), "totalBasicDeluxscore", 8658777247847008159L);
        setLongField(term225630, term225630.getClass(), "totalAdvancedDeluxscore", 3273123371166375467L);
        setLongField(term225630, term225630.getClass(), "totalExpertDeluxscore", -6205677879514991907L);
        setLongField(term225630, term225630.getClass(), "totalMasterDeluxscore", 1929850772420268482L);
        setLongField(term225630, term225630.getClass(), "totalReMasterDeluxscore", -5029412497698150722L);
        setIntField(term225630, term225630.getClass(), "totalSync", 1682421727);
        setIntField(term225630, term225630.getClass(), "totalBasicSync", 1305604796);
        setIntField(term225630, term225630.getClass(), "totalAdvancedSync", -135506333);
        setIntField(term225630, term225630.getClass(), "totalExpertSync", 1938906824);
        setIntField(term225630, term225630.getClass(), "totalMasterSync", -1898614835);
        setIntField(term225630, term225630.getClass(), "totalReMasterSync", -102506456);
        setLongField(term225630, term225630.getClass(), "totalAchievement", -2199087486060229158L);
        setLongField(term225630, term225630.getClass(), "totalBasicAchievement", -4073944005565232294L);
        setLongField(term225630, term225630.getClass(), "totalAdvancedAchievement", -6497624916602474685L);
        setLongField(term225630, term225630.getClass(), "totalExpertAchievement", 6760544199192294462L);
        setLongField(term225630, term225630.getClass(), "totalMasterAchievement", -6651079315330617353L);
        setLongField(term225630, term225630.getClass(), "totalReMasterAchievement", -6320752922130515092L);
        setLongField(term225630, term225630.getClass(), "playerOldRating", 1613162776657945540L);
        setLongField(term225630, term225630.getClass(), "playerNewRating", -3877948757160556378L);
        setIntField(term225630, term225630.getClass(), "banState", -1813716447);
        setLongField(term225630, term225630.getClass(), "dateTime", -6752202374526248146L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpCount", argTypes, term225630, args);
    }

};


