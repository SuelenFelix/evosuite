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

public class UserData_getOverPowerLowerRank_1819146635274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282672;

    public UserData_getOverPowerLowerRank_1819146635274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282672 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term282672, term282672.getClass(), "id", 0L);
        setField(term282672, term282672.getClass(), "card", null);
        setField(term282672, term282672.getClass(), "userName", null);
        setIntField(term282672, term282672.getClass(), "level", 0);
        setIntField(term282672, term282672.getClass(), "reincarnationNum", 0);
        setField(term282672, term282672.getClass(), "exp", null);
        setLongField(term282672, term282672.getClass(), "point", 0L);
        setLongField(term282672, term282672.getClass(), "totalPoint", 0L);
        setIntField(term282672, term282672.getClass(), "playCount", 0);
        setIntField(term282672, term282672.getClass(), "multiPlayCount", 0);
        setIntField(term282672, term282672.getClass(), "playerRating", 0);
        setIntField(term282672, term282672.getClass(), "highestRating", 0);
        setIntField(term282672, term282672.getClass(), "nameplateId", 0);
        setIntField(term282672, term282672.getClass(), "frameId", 0);
        setIntField(term282672, term282672.getClass(), "characterId", 0);
        setIntField(term282672, term282672.getClass(), "trophyId", 0);
        setIntField(term282672, term282672.getClass(), "playedTutorialBit", 0);
        setIntField(term282672, term282672.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term282672, term282672.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term282672, term282672.getClass(), "totalMapNum", 0);
        setLongField(term282672, term282672.getClass(), "totalHiScore", 0L);
        setLongField(term282672, term282672.getClass(), "totalBasicHighScore", 0L);
        setLongField(term282672, term282672.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term282672, term282672.getClass(), "totalExpertHighScore", 0L);
        setLongField(term282672, term282672.getClass(), "totalMasterHighScore", 0L);
        setLongField(term282672, term282672.getClass(), "totalUltimaHighScore", 0L);
        setField(term282672, term282672.getClass(), "eventWatchedDate", null);
        setIntField(term282672, term282672.getClass(), "friendCount", 0);
        setField(term282672, term282672.getClass(), "firstGameId", null);
        setField(term282672, term282672.getClass(), "firstRomVersion", null);
        setField(term282672, term282672.getClass(), "firstDataVersion", null);
        setField(term282672, term282672.getClass(), "firstPlayDate", null);
        setField(term282672, term282672.getClass(), "lastGameId", null);
        setField(term282672, term282672.getClass(), "lastRomVersion", null);
        setField(term282672, term282672.getClass(), "lastDataVersion", null);
        setField(term282672, term282672.getClass(), "lastLoginDate", null);
        setField(term282672, term282672.getClass(), "lastPlayDate", null);
        setIntField(term282672, term282672.getClass(), "lastPlaceId", 0);
        setField(term282672, term282672.getClass(), "lastPlaceName", null);
        setField(term282672, term282672.getClass(), "lastRegionId", null);
        setField(term282672, term282672.getClass(), "lastRegionName", null);
        setField(term282672, term282672.getClass(), "lastAllNetId", null);
        setField(term282672, term282672.getClass(), "lastClientId", null);
        setField(term282672, term282672.getClass(), "lastCountryCode", null);
        setField(term282672, term282672.getClass(), "userNameEx", null);
        setField(term282672, term282672.getClass(), "compatibleCmVersion", null);
        setIntField(term282672, term282672.getClass(), "medal", 0);
        setIntField(term282672, term282672.getClass(), "mapIconId", 0);
        setIntField(term282672, term282672.getClass(), "voiceId", 0);
        setIntField(term282672, term282672.getClass(), "avatarWear", 0);
        setIntField(term282672, term282672.getClass(), "avatarHead", 0);
        setIntField(term282672, term282672.getClass(), "avatarFace", 0);
        setIntField(term282672, term282672.getClass(), "avatarSkin", 0);
        setIntField(term282672, term282672.getClass(), "avatarItem", 0);
        setIntField(term282672, term282672.getClass(), "avatarFront", 0);
        setIntField(term282672, term282672.getClass(), "avatarBack", 0);
        setIntField(term282672, term282672.getClass(), "classEmblemBase", 0);
        setIntField(term282672, term282672.getClass(), "classEmblemMedal", 0);
        setIntField(term282672, term282672.getClass(), "stockedGridCount", 0);
        setIntField(term282672, term282672.getClass(), "exMapLoopCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattlePlayCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattleWinCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattleLoseCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term282672, term282672.getClass(), "charaIllustId", 0);
        setIntField(term282672, term282672.getClass(), "skillId", 0);
        setIntField(term282672, term282672.getClass(), "overPowerPoint", 0);
        setIntField(term282672, term282672.getClass(), "overPowerRate", 0);
        setIntField(term282672, term282672.getClass(), "overPowerLowerRank", 0);
        setIntField(term282672, term282672.getClass(), "avatarPoint", 0);
        setIntField(term282672, term282672.getClass(), "battleRankId", 0);
        setIntField(term282672, term282672.getClass(), "battleRankPoint", 0);
        setIntField(term282672, term282672.getClass(), "eliteRankPoint", 0);
        setIntField(term282672, term282672.getClass(), "netBattle1stCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattle2ndCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattle3rdCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattle4thCount", 0);
        setIntField(term282672, term282672.getClass(), "netBattleCorrection", 0);
        setIntField(term282672, term282672.getClass(), "netBattleErrCnt", 0);
        setIntField(term282672, term282672.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term282672, term282672.getClass(), "battleRewardStatus", 0);
        setIntField(term282672, term282672.getClass(), "battleRewardIndex", 0);
        setIntField(term282672, term282672.getClass(), "battleRewardCount", 0);
        setIntField(term282672, term282672.getClass(), "ext1", 0);
        setIntField(term282672, term282672.getClass(), "ext2", 0);
        setIntField(term282672, term282672.getClass(), "ext3", 0);
        setIntField(term282672, term282672.getClass(), "ext4", 0);
        setIntField(term282672, term282672.getClass(), "ext5", 0);
        setIntField(term282672, term282672.getClass(), "ext6", 0);
        setIntField(term282672, term282672.getClass(), "ext7", 0);
        setIntField(term282672, term282672.getClass(), "ext8", 0);
        setIntField(term282672, term282672.getClass(), "ext9", 0);
        setIntField(term282672, term282672.getClass(), "ext10", 0);
        setField(term282672, term282672.getClass(), "extStr1", null);
        setField(term282672, term282672.getClass(), "extStr2", null);
        setLongField(term282672, term282672.getClass(), "extLong1", 0L);
        setLongField(term282672, term282672.getClass(), "extLong2", 0L);
        setField(term282672, term282672.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term282672, term282672.getClass(), "isNetBattleHost", false);
        setIntField(term282672, term282672.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverPowerLowerRank", argTypes, term282672, args);
    }

};


