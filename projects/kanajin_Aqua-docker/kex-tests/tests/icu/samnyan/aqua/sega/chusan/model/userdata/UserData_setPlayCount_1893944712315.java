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
import java.lang.Integer;

public class UserData_setPlayCount_1893944712315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220363;
     Object term4220440;

    public UserData_setPlayCount_1893944712315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220363 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220363, term4220363.getClass(), "id", 0L);
        setField(term4220363, term4220363.getClass(), "card", null);
        setField(term4220363, term4220363.getClass(), "userName", null);
        setIntField(term4220363, term4220363.getClass(), "level", 0);
        setIntField(term4220363, term4220363.getClass(), "reincarnationNum", 0);
        setField(term4220363, term4220363.getClass(), "exp", null);
        setLongField(term4220363, term4220363.getClass(), "point", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalPoint", 0L);
        setIntField(term4220363, term4220363.getClass(), "playCount", 0);
        setIntField(term4220363, term4220363.getClass(), "multiPlayCount", 0);
        setIntField(term4220363, term4220363.getClass(), "playerRating", 0);
        setIntField(term4220363, term4220363.getClass(), "highestRating", 0);
        setIntField(term4220363, term4220363.getClass(), "nameplateId", 0);
        setIntField(term4220363, term4220363.getClass(), "frameId", 0);
        setIntField(term4220363, term4220363.getClass(), "characterId", 0);
        setIntField(term4220363, term4220363.getClass(), "trophyId", 0);
        setIntField(term4220363, term4220363.getClass(), "playedTutorialBit", 0);
        setIntField(term4220363, term4220363.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220363, term4220363.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220363, term4220363.getClass(), "totalMapNum", 0);
        setLongField(term4220363, term4220363.getClass(), "totalHiScore", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220363, term4220363.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220363, term4220363.getClass(), "eventWatchedDate", null);
        setIntField(term4220363, term4220363.getClass(), "friendCount", 0);
        setField(term4220363, term4220363.getClass(), "firstGameId", null);
        setField(term4220363, term4220363.getClass(), "firstRomVersion", null);
        setField(term4220363, term4220363.getClass(), "firstDataVersion", null);
        setField(term4220363, term4220363.getClass(), "firstPlayDate", null);
        setField(term4220363, term4220363.getClass(), "lastGameId", null);
        setField(term4220363, term4220363.getClass(), "lastRomVersion", null);
        setField(term4220363, term4220363.getClass(), "lastDataVersion", null);
        setField(term4220363, term4220363.getClass(), "lastLoginDate", null);
        setField(term4220363, term4220363.getClass(), "lastPlayDate", null);
        setIntField(term4220363, term4220363.getClass(), "lastPlaceId", 0);
        setField(term4220363, term4220363.getClass(), "lastPlaceName", null);
        setField(term4220363, term4220363.getClass(), "lastRegionId", null);
        setField(term4220363, term4220363.getClass(), "lastRegionName", null);
        setField(term4220363, term4220363.getClass(), "lastAllNetId", null);
        setField(term4220363, term4220363.getClass(), "lastClientId", null);
        setField(term4220363, term4220363.getClass(), "lastCountryCode", null);
        setField(term4220363, term4220363.getClass(), "userNameEx", null);
        setField(term4220363, term4220363.getClass(), "compatibleCmVersion", null);
        setIntField(term4220363, term4220363.getClass(), "medal", 0);
        setIntField(term4220363, term4220363.getClass(), "mapIconId", 0);
        setIntField(term4220363, term4220363.getClass(), "voiceId", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarWear", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarHead", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarFace", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarSkin", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarItem", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarFront", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarBack", 0);
        setIntField(term4220363, term4220363.getClass(), "classEmblemBase", 0);
        setIntField(term4220363, term4220363.getClass(), "classEmblemMedal", 0);
        setIntField(term4220363, term4220363.getClass(), "stockedGridCount", 0);
        setIntField(term4220363, term4220363.getClass(), "exMapLoopCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleWinCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220363, term4220363.getClass(), "charaIllustId", 0);
        setIntField(term4220363, term4220363.getClass(), "skillId", 0);
        setIntField(term4220363, term4220363.getClass(), "overPowerPoint", 0);
        setIntField(term4220363, term4220363.getClass(), "overPowerRate", 0);
        setIntField(term4220363, term4220363.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220363, term4220363.getClass(), "avatarPoint", 0);
        setIntField(term4220363, term4220363.getClass(), "battleRankId", 0);
        setIntField(term4220363, term4220363.getClass(), "battleRankPoint", 0);
        setIntField(term4220363, term4220363.getClass(), "eliteRankPoint", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattle1stCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattle4thCount", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleCorrection", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220363, term4220363.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220363, term4220363.getClass(), "battleRewardStatus", 0);
        setIntField(term4220363, term4220363.getClass(), "battleRewardIndex", 0);
        setIntField(term4220363, term4220363.getClass(), "battleRewardCount", 0);
        setIntField(term4220363, term4220363.getClass(), "ext1", 0);
        setIntField(term4220363, term4220363.getClass(), "ext2", 0);
        setIntField(term4220363, term4220363.getClass(), "ext3", 0);
        setIntField(term4220363, term4220363.getClass(), "ext4", 0);
        setIntField(term4220363, term4220363.getClass(), "ext5", 0);
        setIntField(term4220363, term4220363.getClass(), "ext6", 0);
        setIntField(term4220363, term4220363.getClass(), "ext7", 0);
        setIntField(term4220363, term4220363.getClass(), "ext8", 0);
        setIntField(term4220363, term4220363.getClass(), "ext9", 0);
        setIntField(term4220363, term4220363.getClass(), "ext10", 0);
        setField(term4220363, term4220363.getClass(), "extStr1", null);
        setField(term4220363, term4220363.getClass(), "extStr2", null);
        setLongField(term4220363, term4220363.getClass(), "extLong1", 0L);
        setLongField(term4220363, term4220363.getClass(), "extLong2", 0L);
        setField(term4220363, term4220363.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220363, term4220363.getClass(), "isNetBattleHost", false);
        setIntField(term4220363, term4220363.getClass(), "netBattleEndState", 0);
        term4220440 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220440;
        callMethod(klass, "setPlayCount", argTypes, term4220363, args);
    }

};


