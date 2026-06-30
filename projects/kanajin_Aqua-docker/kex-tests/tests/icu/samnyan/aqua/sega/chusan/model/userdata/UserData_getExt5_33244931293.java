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

public class UserData_getExt5_33244931293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284135;

    public UserData_getExt5_33244931293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284135 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284135, term284135.getClass(), "id", 0L);
        setField(term284135, term284135.getClass(), "card", null);
        setField(term284135, term284135.getClass(), "userName", null);
        setIntField(term284135, term284135.getClass(), "level", 0);
        setIntField(term284135, term284135.getClass(), "reincarnationNum", 0);
        setField(term284135, term284135.getClass(), "exp", null);
        setLongField(term284135, term284135.getClass(), "point", 0L);
        setLongField(term284135, term284135.getClass(), "totalPoint", 0L);
        setIntField(term284135, term284135.getClass(), "playCount", 0);
        setIntField(term284135, term284135.getClass(), "multiPlayCount", 0);
        setIntField(term284135, term284135.getClass(), "playerRating", 0);
        setIntField(term284135, term284135.getClass(), "highestRating", 0);
        setIntField(term284135, term284135.getClass(), "nameplateId", 0);
        setIntField(term284135, term284135.getClass(), "frameId", 0);
        setIntField(term284135, term284135.getClass(), "characterId", 0);
        setIntField(term284135, term284135.getClass(), "trophyId", 0);
        setIntField(term284135, term284135.getClass(), "playedTutorialBit", 0);
        setIntField(term284135, term284135.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284135, term284135.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284135, term284135.getClass(), "totalMapNum", 0);
        setLongField(term284135, term284135.getClass(), "totalHiScore", 0L);
        setLongField(term284135, term284135.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284135, term284135.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284135, term284135.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284135, term284135.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284135, term284135.getClass(), "totalUltimaHighScore", 0L);
        setField(term284135, term284135.getClass(), "eventWatchedDate", null);
        setIntField(term284135, term284135.getClass(), "friendCount", 0);
        setField(term284135, term284135.getClass(), "firstGameId", null);
        setField(term284135, term284135.getClass(), "firstRomVersion", null);
        setField(term284135, term284135.getClass(), "firstDataVersion", null);
        setField(term284135, term284135.getClass(), "firstPlayDate", null);
        setField(term284135, term284135.getClass(), "lastGameId", null);
        setField(term284135, term284135.getClass(), "lastRomVersion", null);
        setField(term284135, term284135.getClass(), "lastDataVersion", null);
        setField(term284135, term284135.getClass(), "lastLoginDate", null);
        setField(term284135, term284135.getClass(), "lastPlayDate", null);
        setIntField(term284135, term284135.getClass(), "lastPlaceId", 0);
        setField(term284135, term284135.getClass(), "lastPlaceName", null);
        setField(term284135, term284135.getClass(), "lastRegionId", null);
        setField(term284135, term284135.getClass(), "lastRegionName", null);
        setField(term284135, term284135.getClass(), "lastAllNetId", null);
        setField(term284135, term284135.getClass(), "lastClientId", null);
        setField(term284135, term284135.getClass(), "lastCountryCode", null);
        setField(term284135, term284135.getClass(), "userNameEx", null);
        setField(term284135, term284135.getClass(), "compatibleCmVersion", null);
        setIntField(term284135, term284135.getClass(), "medal", 0);
        setIntField(term284135, term284135.getClass(), "mapIconId", 0);
        setIntField(term284135, term284135.getClass(), "voiceId", 0);
        setIntField(term284135, term284135.getClass(), "avatarWear", 0);
        setIntField(term284135, term284135.getClass(), "avatarHead", 0);
        setIntField(term284135, term284135.getClass(), "avatarFace", 0);
        setIntField(term284135, term284135.getClass(), "avatarSkin", 0);
        setIntField(term284135, term284135.getClass(), "avatarItem", 0);
        setIntField(term284135, term284135.getClass(), "avatarFront", 0);
        setIntField(term284135, term284135.getClass(), "avatarBack", 0);
        setIntField(term284135, term284135.getClass(), "classEmblemBase", 0);
        setIntField(term284135, term284135.getClass(), "classEmblemMedal", 0);
        setIntField(term284135, term284135.getClass(), "stockedGridCount", 0);
        setIntField(term284135, term284135.getClass(), "exMapLoopCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattlePlayCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattleWinCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattleLoseCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284135, term284135.getClass(), "charaIllustId", 0);
        setIntField(term284135, term284135.getClass(), "skillId", 0);
        setIntField(term284135, term284135.getClass(), "overPowerPoint", 0);
        setIntField(term284135, term284135.getClass(), "overPowerRate", 0);
        setIntField(term284135, term284135.getClass(), "overPowerLowerRank", 0);
        setIntField(term284135, term284135.getClass(), "avatarPoint", 0);
        setIntField(term284135, term284135.getClass(), "battleRankId", 0);
        setIntField(term284135, term284135.getClass(), "battleRankPoint", 0);
        setIntField(term284135, term284135.getClass(), "eliteRankPoint", 0);
        setIntField(term284135, term284135.getClass(), "netBattle1stCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattle2ndCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattle3rdCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattle4thCount", 0);
        setIntField(term284135, term284135.getClass(), "netBattleCorrection", 0);
        setIntField(term284135, term284135.getClass(), "netBattleErrCnt", 0);
        setIntField(term284135, term284135.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284135, term284135.getClass(), "battleRewardStatus", 0);
        setIntField(term284135, term284135.getClass(), "battleRewardIndex", 0);
        setIntField(term284135, term284135.getClass(), "battleRewardCount", 0);
        setIntField(term284135, term284135.getClass(), "ext1", 0);
        setIntField(term284135, term284135.getClass(), "ext2", 0);
        setIntField(term284135, term284135.getClass(), "ext3", 0);
        setIntField(term284135, term284135.getClass(), "ext4", 0);
        setIntField(term284135, term284135.getClass(), "ext5", 0);
        setIntField(term284135, term284135.getClass(), "ext6", 0);
        setIntField(term284135, term284135.getClass(), "ext7", 0);
        setIntField(term284135, term284135.getClass(), "ext8", 0);
        setIntField(term284135, term284135.getClass(), "ext9", 0);
        setIntField(term284135, term284135.getClass(), "ext10", 0);
        setField(term284135, term284135.getClass(), "extStr1", null);
        setField(term284135, term284135.getClass(), "extStr2", null);
        setLongField(term284135, term284135.getClass(), "extLong1", 0L);
        setLongField(term284135, term284135.getClass(), "extLong2", 0L);
        setField(term284135, term284135.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284135, term284135.getClass(), "isNetBattleHost", false);
        setIntField(term284135, term284135.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt5", argTypes, term284135, args);
    }

};


