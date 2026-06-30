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

public class UserData_getMultiPlayCount_1394465071215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278129;

    public UserData_getMultiPlayCount_1394465071215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278129 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278129, term278129.getClass(), "id", 0L);
        setField(term278129, term278129.getClass(), "card", null);
        setField(term278129, term278129.getClass(), "userName", null);
        setIntField(term278129, term278129.getClass(), "level", 0);
        setIntField(term278129, term278129.getClass(), "reincarnationNum", 0);
        setField(term278129, term278129.getClass(), "exp", null);
        setLongField(term278129, term278129.getClass(), "point", 0L);
        setLongField(term278129, term278129.getClass(), "totalPoint", 0L);
        setIntField(term278129, term278129.getClass(), "playCount", 0);
        setIntField(term278129, term278129.getClass(), "multiPlayCount", 0);
        setIntField(term278129, term278129.getClass(), "playerRating", 0);
        setIntField(term278129, term278129.getClass(), "highestRating", 0);
        setIntField(term278129, term278129.getClass(), "nameplateId", 0);
        setIntField(term278129, term278129.getClass(), "frameId", 0);
        setIntField(term278129, term278129.getClass(), "characterId", 0);
        setIntField(term278129, term278129.getClass(), "trophyId", 0);
        setIntField(term278129, term278129.getClass(), "playedTutorialBit", 0);
        setIntField(term278129, term278129.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278129, term278129.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278129, term278129.getClass(), "totalMapNum", 0);
        setLongField(term278129, term278129.getClass(), "totalHiScore", 0L);
        setLongField(term278129, term278129.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278129, term278129.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278129, term278129.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278129, term278129.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278129, term278129.getClass(), "totalUltimaHighScore", 0L);
        setField(term278129, term278129.getClass(), "eventWatchedDate", null);
        setIntField(term278129, term278129.getClass(), "friendCount", 0);
        setField(term278129, term278129.getClass(), "firstGameId", null);
        setField(term278129, term278129.getClass(), "firstRomVersion", null);
        setField(term278129, term278129.getClass(), "firstDataVersion", null);
        setField(term278129, term278129.getClass(), "firstPlayDate", null);
        setField(term278129, term278129.getClass(), "lastGameId", null);
        setField(term278129, term278129.getClass(), "lastRomVersion", null);
        setField(term278129, term278129.getClass(), "lastDataVersion", null);
        setField(term278129, term278129.getClass(), "lastLoginDate", null);
        setField(term278129, term278129.getClass(), "lastPlayDate", null);
        setIntField(term278129, term278129.getClass(), "lastPlaceId", 0);
        setField(term278129, term278129.getClass(), "lastPlaceName", null);
        setField(term278129, term278129.getClass(), "lastRegionId", null);
        setField(term278129, term278129.getClass(), "lastRegionName", null);
        setField(term278129, term278129.getClass(), "lastAllNetId", null);
        setField(term278129, term278129.getClass(), "lastClientId", null);
        setField(term278129, term278129.getClass(), "lastCountryCode", null);
        setField(term278129, term278129.getClass(), "userNameEx", null);
        setField(term278129, term278129.getClass(), "compatibleCmVersion", null);
        setIntField(term278129, term278129.getClass(), "medal", 0);
        setIntField(term278129, term278129.getClass(), "mapIconId", 0);
        setIntField(term278129, term278129.getClass(), "voiceId", 0);
        setIntField(term278129, term278129.getClass(), "avatarWear", 0);
        setIntField(term278129, term278129.getClass(), "avatarHead", 0);
        setIntField(term278129, term278129.getClass(), "avatarFace", 0);
        setIntField(term278129, term278129.getClass(), "avatarSkin", 0);
        setIntField(term278129, term278129.getClass(), "avatarItem", 0);
        setIntField(term278129, term278129.getClass(), "avatarFront", 0);
        setIntField(term278129, term278129.getClass(), "avatarBack", 0);
        setIntField(term278129, term278129.getClass(), "classEmblemBase", 0);
        setIntField(term278129, term278129.getClass(), "classEmblemMedal", 0);
        setIntField(term278129, term278129.getClass(), "stockedGridCount", 0);
        setIntField(term278129, term278129.getClass(), "exMapLoopCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattlePlayCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattleWinCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattleLoseCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278129, term278129.getClass(), "charaIllustId", 0);
        setIntField(term278129, term278129.getClass(), "skillId", 0);
        setIntField(term278129, term278129.getClass(), "overPowerPoint", 0);
        setIntField(term278129, term278129.getClass(), "overPowerRate", 0);
        setIntField(term278129, term278129.getClass(), "overPowerLowerRank", 0);
        setIntField(term278129, term278129.getClass(), "avatarPoint", 0);
        setIntField(term278129, term278129.getClass(), "battleRankId", 0);
        setIntField(term278129, term278129.getClass(), "battleRankPoint", 0);
        setIntField(term278129, term278129.getClass(), "eliteRankPoint", 0);
        setIntField(term278129, term278129.getClass(), "netBattle1stCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattle2ndCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattle3rdCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattle4thCount", 0);
        setIntField(term278129, term278129.getClass(), "netBattleCorrection", 0);
        setIntField(term278129, term278129.getClass(), "netBattleErrCnt", 0);
        setIntField(term278129, term278129.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278129, term278129.getClass(), "battleRewardStatus", 0);
        setIntField(term278129, term278129.getClass(), "battleRewardIndex", 0);
        setIntField(term278129, term278129.getClass(), "battleRewardCount", 0);
        setIntField(term278129, term278129.getClass(), "ext1", 0);
        setIntField(term278129, term278129.getClass(), "ext2", 0);
        setIntField(term278129, term278129.getClass(), "ext3", 0);
        setIntField(term278129, term278129.getClass(), "ext4", 0);
        setIntField(term278129, term278129.getClass(), "ext5", 0);
        setIntField(term278129, term278129.getClass(), "ext6", 0);
        setIntField(term278129, term278129.getClass(), "ext7", 0);
        setIntField(term278129, term278129.getClass(), "ext8", 0);
        setIntField(term278129, term278129.getClass(), "ext9", 0);
        setIntField(term278129, term278129.getClass(), "ext10", 0);
        setField(term278129, term278129.getClass(), "extStr1", null);
        setField(term278129, term278129.getClass(), "extStr2", null);
        setLongField(term278129, term278129.getClass(), "extLong1", 0L);
        setLongField(term278129, term278129.getClass(), "extLong2", 0L);
        setField(term278129, term278129.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278129, term278129.getClass(), "isNetBattleHost", false);
        setIntField(term278129, term278129.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiPlayCount", argTypes, term278129, args);
    }

};


