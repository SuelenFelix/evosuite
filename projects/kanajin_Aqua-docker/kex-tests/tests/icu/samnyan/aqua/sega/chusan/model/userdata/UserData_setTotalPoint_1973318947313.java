package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalPoint_1973318947313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285683;
     Object term285760;

    public UserData_setTotalPoint_1973318947313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285683 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285683, term285683.getClass(), "id", 0L);
        setField(term285683, term285683.getClass(), "card", null);
        setField(term285683, term285683.getClass(), "userName", null);
        setIntField(term285683, term285683.getClass(), "level", 0);
        setIntField(term285683, term285683.getClass(), "reincarnationNum", 0);
        setField(term285683, term285683.getClass(), "exp", null);
        setLongField(term285683, term285683.getClass(), "point", 0L);
        setLongField(term285683, term285683.getClass(), "totalPoint", 0L);
        setIntField(term285683, term285683.getClass(), "playCount", 0);
        setIntField(term285683, term285683.getClass(), "multiPlayCount", 0);
        setIntField(term285683, term285683.getClass(), "playerRating", 0);
        setIntField(term285683, term285683.getClass(), "highestRating", 0);
        setIntField(term285683, term285683.getClass(), "nameplateId", 0);
        setIntField(term285683, term285683.getClass(), "frameId", 0);
        setIntField(term285683, term285683.getClass(), "characterId", 0);
        setIntField(term285683, term285683.getClass(), "trophyId", 0);
        setIntField(term285683, term285683.getClass(), "playedTutorialBit", 0);
        setIntField(term285683, term285683.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285683, term285683.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285683, term285683.getClass(), "totalMapNum", 0);
        setLongField(term285683, term285683.getClass(), "totalHiScore", 0L);
        setLongField(term285683, term285683.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285683, term285683.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285683, term285683.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285683, term285683.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285683, term285683.getClass(), "totalUltimaHighScore", 0L);
        setField(term285683, term285683.getClass(), "eventWatchedDate", null);
        setIntField(term285683, term285683.getClass(), "friendCount", 0);
        setField(term285683, term285683.getClass(), "firstGameId", null);
        setField(term285683, term285683.getClass(), "firstRomVersion", null);
        setField(term285683, term285683.getClass(), "firstDataVersion", null);
        setField(term285683, term285683.getClass(), "firstPlayDate", null);
        setField(term285683, term285683.getClass(), "lastGameId", null);
        setField(term285683, term285683.getClass(), "lastRomVersion", null);
        setField(term285683, term285683.getClass(), "lastDataVersion", null);
        setField(term285683, term285683.getClass(), "lastLoginDate", null);
        setField(term285683, term285683.getClass(), "lastPlayDate", null);
        setIntField(term285683, term285683.getClass(), "lastPlaceId", 0);
        setField(term285683, term285683.getClass(), "lastPlaceName", null);
        setField(term285683, term285683.getClass(), "lastRegionId", null);
        setField(term285683, term285683.getClass(), "lastRegionName", null);
        setField(term285683, term285683.getClass(), "lastAllNetId", null);
        setField(term285683, term285683.getClass(), "lastClientId", null);
        setField(term285683, term285683.getClass(), "lastCountryCode", null);
        setField(term285683, term285683.getClass(), "userNameEx", null);
        setField(term285683, term285683.getClass(), "compatibleCmVersion", null);
        setIntField(term285683, term285683.getClass(), "medal", 0);
        setIntField(term285683, term285683.getClass(), "mapIconId", 0);
        setIntField(term285683, term285683.getClass(), "voiceId", 0);
        setIntField(term285683, term285683.getClass(), "avatarWear", 0);
        setIntField(term285683, term285683.getClass(), "avatarHead", 0);
        setIntField(term285683, term285683.getClass(), "avatarFace", 0);
        setIntField(term285683, term285683.getClass(), "avatarSkin", 0);
        setIntField(term285683, term285683.getClass(), "avatarItem", 0);
        setIntField(term285683, term285683.getClass(), "avatarFront", 0);
        setIntField(term285683, term285683.getClass(), "avatarBack", 0);
        setIntField(term285683, term285683.getClass(), "classEmblemBase", 0);
        setIntField(term285683, term285683.getClass(), "classEmblemMedal", 0);
        setIntField(term285683, term285683.getClass(), "stockedGridCount", 0);
        setIntField(term285683, term285683.getClass(), "exMapLoopCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattlePlayCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattleWinCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattleLoseCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285683, term285683.getClass(), "charaIllustId", 0);
        setIntField(term285683, term285683.getClass(), "skillId", 0);
        setIntField(term285683, term285683.getClass(), "overPowerPoint", 0);
        setIntField(term285683, term285683.getClass(), "overPowerRate", 0);
        setIntField(term285683, term285683.getClass(), "overPowerLowerRank", 0);
        setIntField(term285683, term285683.getClass(), "avatarPoint", 0);
        setIntField(term285683, term285683.getClass(), "battleRankId", 0);
        setIntField(term285683, term285683.getClass(), "battleRankPoint", 0);
        setIntField(term285683, term285683.getClass(), "eliteRankPoint", 0);
        setIntField(term285683, term285683.getClass(), "netBattle1stCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattle2ndCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattle3rdCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattle4thCount", 0);
        setIntField(term285683, term285683.getClass(), "netBattleCorrection", 0);
        setIntField(term285683, term285683.getClass(), "netBattleErrCnt", 0);
        setIntField(term285683, term285683.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285683, term285683.getClass(), "battleRewardStatus", 0);
        setIntField(term285683, term285683.getClass(), "battleRewardIndex", 0);
        setIntField(term285683, term285683.getClass(), "battleRewardCount", 0);
        setIntField(term285683, term285683.getClass(), "ext1", 0);
        setIntField(term285683, term285683.getClass(), "ext2", 0);
        setIntField(term285683, term285683.getClass(), "ext3", 0);
        setIntField(term285683, term285683.getClass(), "ext4", 0);
        setIntField(term285683, term285683.getClass(), "ext5", 0);
        setIntField(term285683, term285683.getClass(), "ext6", 0);
        setIntField(term285683, term285683.getClass(), "ext7", 0);
        setIntField(term285683, term285683.getClass(), "ext8", 0);
        setIntField(term285683, term285683.getClass(), "ext9", 0);
        setIntField(term285683, term285683.getClass(), "ext10", 0);
        setField(term285683, term285683.getClass(), "extStr1", null);
        setField(term285683, term285683.getClass(), "extStr2", null);
        setLongField(term285683, term285683.getClass(), "extLong1", 0L);
        setLongField(term285683, term285683.getClass(), "extLong2", 0L);
        setField(term285683, term285683.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285683, term285683.getClass(), "isNetBattleHost", false);
        setIntField(term285683, term285683.getClass(), "netBattleEndState", 0);
        term285760 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term285760;
        callMethod(klass, "setTotalPoint", argTypes, term285683, args);
    }

};


